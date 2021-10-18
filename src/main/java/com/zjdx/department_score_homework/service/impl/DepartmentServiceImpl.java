package com.zjdx.department_score_homework.service.impl;

import com.zjdx.department_score_homework.bean.Department;
import com.zjdx.department_score_homework.bean.User;
import com.zjdx.department_score_homework.mapper.DepartmentMapper;
import com.zjdx.department_score_homework.mapper.UserMapper;
import com.zjdx.department_score_homework.service.DepartmentService;
import com.zjdx.department_score_homework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllDepartment() {
        return departmentMapper.getAllDepartment();
    }
}
