package com.zjdx.department_score_homework.bean;

import lombok.Data;

import java.util.Date;

@Data
public class DepQuesScore {

    private int id;

    private int departmentId;

    private int questionId;

    private int score;

    private Date createTime;

    private Date modifyTime;

}
