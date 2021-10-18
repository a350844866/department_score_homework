package com.zjdx.department_score_homework.service.impl;

import com.zjdx.department_score_homework.bean.Department;
import com.zjdx.department_score_homework.bean.Question;
import com.zjdx.department_score_homework.mapper.DepartmentMapper;
import com.zjdx.department_score_homework.mapper.QuestionMapper;
import com.zjdx.department_score_homework.service.DepartmentService;
import com.zjdx.department_score_homework.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> getAllQuestion() {
        return questionMapper.getAllQuestion();
    }
}
