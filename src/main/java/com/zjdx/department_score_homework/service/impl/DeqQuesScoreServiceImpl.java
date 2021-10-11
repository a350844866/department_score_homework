package com.zjdx.department_score_homework.service.impl;

import com.zjdx.department_score_homework.bean.DepQuesScore;
import com.zjdx.department_score_homework.bean.Department;
import com.zjdx.department_score_homework.mapper.DepQuesScoreMapper;
import com.zjdx.department_score_homework.mapper.DepartmentMapper;
import com.zjdx.department_score_homework.service.DepartmentService;
import com.zjdx.department_score_homework.service.DeqQuesScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeqQuesScoreServiceImpl implements DeqQuesScoreService {

    @Autowired
    private DepQuesScoreMapper depQuesScoreMapper;

    @Override
    public List<DepQuesScore> getAllData() {
        return depQuesScoreMapper.getAllData();
    }

    @Override
    public boolean updateDataList(List<DepQuesScore> depQuesScoreList) {
        return depQuesScoreMapper.updateDataList(depQuesScoreList);
    }
}
