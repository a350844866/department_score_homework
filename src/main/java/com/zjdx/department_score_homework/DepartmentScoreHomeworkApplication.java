package com.zjdx.department_score_homework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjdx.department_score_homework.mapper")
public class DepartmentScoreHomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentScoreHomeworkApplication.class, args);
    }

}
