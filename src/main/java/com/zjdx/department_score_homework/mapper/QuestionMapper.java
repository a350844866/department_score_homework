package com.zjdx.department_score_homework.mapper;

import com.zjdx.department_score_homework.bean.Question;

import java.util.List;

public interface QuestionMapper {

    /**
     * 获取全部部门
     * @return
     */
    List<Question> getAllDQuestion();
}
