package com.zjdx.department_score_homework.mapper;

import com.zjdx.department_score_homework.bean.User;

public interface UserMapper {

    /**
     * 根据登录名和密码查找用户
     *
     * @param loginName
     * @param password
     * @return
     */
    User findUserByU_P(String loginName, String password);
}
