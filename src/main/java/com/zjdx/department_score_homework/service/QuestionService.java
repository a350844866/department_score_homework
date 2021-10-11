package com.zjdx.department_score_homework.service;


import com.zjdx.department_score_homework.bean.Department;
import com.zjdx.department_score_homework.bean.Question;
import com.zjdx.department_score_homework.bean.User;

import java.util.List;


public interface QuestionService {
    /**
     * 获取全部问题
     * @return
     */
    List<Question> getAllQuestion();

}
