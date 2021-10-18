package com.zjdx.department_score_homework.service;


import com.zjdx.department_score_homework.bean.DepQuesScore;
import com.zjdx.department_score_homework.bean.Question;

import java.util.List;


public interface DepQuesScoreService {

    /**
     * 插入数据
     * @param depQuesScore
     */
    public void insert(DepQuesScore depQuesScore);

    /**
     * 获取全部数据
     * @return
     */
    public List<DepQuesScore> getAllData();

    /**
     * 更新数据
     * @param depQuesScoreList
     * @return
     */
    public boolean updateDataList(List<DepQuesScore> depQuesScoreList);

    /**
     * 根据唯一约束查询
     * @param departmentId
     * @param questionId
     * @return
     */
    DepQuesScore getByUK(int departmentId, int questionId,int userId);

    /**
     * 根据id更新分数
     * @param score
     * @param id
     * @return
     */
    boolean updateScoreById(int score, int id);
    /**
     * 根據評價人查詢選項
     * @param userId
     * @return
     */
    List<DepQuesScore> getByUserId(int userId);
}
