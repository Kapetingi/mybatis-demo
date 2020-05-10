package org.katarsis.demomybatis.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final EmployeeMapper employeeMapper;

    public EmployeeRepositoryImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }


    @Override
    public List<Employee> getEmployees() {
        return employeeMapper.findAllEmployees();
    }
}
