package com.zjdx.department_score_homework.controller;

import com.zjdx.department_score_homework.bean.DepQuesScore;
import com.zjdx.department_score_homework.bean.Department;
import com.zjdx.department_score_homework.bean.Question;
import com.zjdx.department_score_homework.bean.User;
import com.zjdx.department_score_homework.service.DepQuesScoreService;
import com.zjdx.department_score_homework.service.DepartmentService;
import com.zjdx.department_score_homework.service.QuestionService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class ScoreController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private DepQuesScoreService depQuesScoreService;


    @GetMapping("score")
    public String init(ModelMap modelMap) {

        List<Department> allDepartment = departmentService.getAllDepartment();
        modelMap.addAttribute("allDepartment",allDepartment);
        List<Question> allQuestion = questionService.getAllQuestion();
        modelMap.addAttribute("allQuestion", allQuestion);

        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        if (null == user) {
            return "redirect:/login";
        }
        List<DepQuesScore> dataList = depQuesScoreService.getByUserId(user.getId());
        modelMap.addAttribute("dataList", dataList);
        return "/score";
    }


    @PostMapping("score")
    public String doRecord(ModelMap modelMap, HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        if (null == user) {
            return "redirect:/login";
        }
        parameterMap.forEach((k,v)->{
            String[] keySplit = StringUtils.split(k, "-");
            int departmentId = Integer.parseInt(keySplit[0]);
            int questionId = Integer.parseInt(keySplit[1]);
            //如果已经存在则更新
            DepQuesScore existData = depQuesScoreService.getByUK(departmentId, questionId,user.getId());
            if (null != existData) {
                depQuesScoreService.updateScoreById(Integer.parseInt(v[0]), existData.getId());
            }else {
                DepQuesScore depQuesScore = new DepQuesScore();
                depQuesScore.setScore(Integer.parseInt(v[0]));
                depQuesScore.setDepartmentId(departmentId);
                depQuesScore.setQuestionId(questionId);
                depQuesScore.setUserId(user.getId());
                depQuesScoreService.insert(depQuesScore);
            }
        });
        return "success";
    }
}
