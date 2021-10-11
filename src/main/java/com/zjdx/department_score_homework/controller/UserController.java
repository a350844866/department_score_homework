package com.zjdx.department_score_homework.controller;

import com.zjdx.department_score_homework.bean.User;
import com.zjdx.department_score_homework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/query")
    public String queryUser(String loginName,String password) {
        User user = userService.findUserByU_P(loginName, password);

        return user.toString();
    }
}
