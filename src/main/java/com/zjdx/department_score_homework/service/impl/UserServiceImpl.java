package com.zjdx.department_score_homework.service.impl;

import com.zjdx.department_score_homework.bean.User;
import com.zjdx.department_score_homework.mapper.UserMapper;
import com.zjdx.department_score_homework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByU_P(String loginName, String password) {
        return userMapper.findUserByU_P(loginName, password);
    }
}
