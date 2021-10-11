package com.zjdx.department_score_homework.bean;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    /**
     * 自增id
     */
    private int id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;


}
