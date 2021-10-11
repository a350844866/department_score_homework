package com.zjdx.department_score_homework.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Department {

    private int id;

    private String departmentName;

    private Date createTime;

    private Date modifyTime;
}
