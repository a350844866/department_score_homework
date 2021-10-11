package com.zjdx.department_score_homework.service;


import com.zjdx.department_score_homework.bean.DepQuesScore;
import com.zjdx.department_score_homework.bean.Question;

import java.util.List;


public interface DeqQuesScoreService {
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
