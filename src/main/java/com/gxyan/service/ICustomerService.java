package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Customer;
import com.gxyan.vo.CustomerQuery;


public interface ICustomerService {
    ServerResponse addCustomer(Customer customer);

    ServerResponse getList(CustomerQuery customerQuery);

    ServerResponse updateCustomer(Customer customer);
}
