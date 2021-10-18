package com.zjdx.department_score_homework.mapper;

import com.zjdx.department_score_homework.bean.DepQuesScore;
import com.zjdx.department_score_homework.bean.Department;

import java.util.List;

public interface DepQuesScoreMapper {

    /**
     * 插入数据
     * @param depQuesScore
     */
    void insert(DepQuesScore depQuesScore);


    /**
     * 获取全部数据
     * @return
     */
    List<DepQuesScore> getAllData();

    /**
     * 更新数据
     * @param depQuesScoreList
     * @return
     */
    boolean updateDataList(List<DepQuesScore> depQuesScoreList);

    /**
     * 通过唯一约束查询
     * @param departmentId
     * @param questionId
     * @return
     */
    DepQuesScore getByUK(int departmentId, int questionId,int userId);

    boolean updateScoreById(int score, int id);

    /**
     * 根據評價人查詢選項
     * @param userId
     * @return
     */
    List<DepQuesScore> getByUserId(int userId);

}
