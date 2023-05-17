package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Employee;


public interface IUserService {

    ServerResponse<Employee> login(Integer userId, String password);
}
