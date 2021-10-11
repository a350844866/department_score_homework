package com.zjdx.department_score_homework.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Question {

    private int id;

    private String questionName;

    private Date createTime;

    private Date modifyTime;

}
