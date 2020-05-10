package org.katarsis.demomybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("Select * from employee")
    List<Employee> findAllEmployees();
}
