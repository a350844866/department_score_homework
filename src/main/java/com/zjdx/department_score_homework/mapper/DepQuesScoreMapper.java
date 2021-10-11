package com.zjdx.department_score_homework.mapper;

import com.zjdx.department_score_homework.bean.DepQuesScore;
import com.zjdx.department_score_homework.bean.Department;

import java.util.List;

public interface DepQuesScoreMapper {

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

}
