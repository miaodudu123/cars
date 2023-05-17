package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Employee;
import com.gxyan.vo.EmployeeQuery;


public interface IEmployeeService {
    ServerResponse addEmployee(Employee employee);

    ServerResponse updateEmployee(Employee employee);

    ServerResponse getList(EmployeeQuery employeeQuery);

    ServerResponse validPassword(Integer id, String validPass);

    ServerResponse updatePassword(Integer id, String oldPass, String newPass);
}
