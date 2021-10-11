package com.zjdx.department_score_homework.service;


import com.zjdx.department_score_homework.bean.Department;
import com.zjdx.department_score_homework.bean.User;

import java.util.List;


public interface DepartmentService {
    /**
     * 获取全部部门
     * @return
     */
    List<Department> getAllDepartment();

}
