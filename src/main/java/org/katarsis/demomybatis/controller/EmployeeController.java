package org.katarsis.demomybatis.controller;


import org.katarsis.demomybatis.dao.Employee;
import org.katarsis.demomybatis.service.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;

    public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getEmployees")
    public List<Employee> getEmployees() {
        return employeeServiceImpl.getEmployee();
    }

}
