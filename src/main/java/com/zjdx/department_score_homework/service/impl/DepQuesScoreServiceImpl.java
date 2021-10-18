package com.zjdx.department_score_homework.service.impl;

import com.zjdx.department_score_homework.bean.DepQuesScore;
import com.zjdx.department_score_homework.mapper.DepQuesScoreMapper;
import com.zjdx.department_score_homework.service.DepQuesScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepQuesScoreServiceImpl implements DepQuesScoreService {

    @Autowired
    private DepQuesScoreMapper depQuesScoreMapper;

    @Override
    public void insert(DepQuesScore depQuesScore) {
        depQuesScoreMapper.insert(depQuesScore);
    }

    @Override
    public List<DepQuesScore> getAllData() {
        return depQuesScoreMapper.getAllData();
    }

    @Override
    public boolean updateDataList(List<DepQuesScore> depQuesScoreList) {
        return depQuesScoreMapper.updateDataList(depQuesScoreList);
    }

    @Override
    public DepQuesScore getByUK(int departmentId, int questionId,int userId ){
        return depQuesScoreMapper.getByUK(departmentId, questionId,userId);
    }

    @Override
    public boolean updateScoreById(int score, int id) {
        return depQuesScoreMapper.updateScoreById(score, id);
    }

    @Override
    public List<DepQuesScore> getByUserId(int userId) {
        return depQuesScoreMapper.getByUserId(userId);
    }
}
