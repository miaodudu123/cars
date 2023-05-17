package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.OrderDetails;
import com.gxyan.vo.DetailsQuery;
import com.gxyan.vo.OrderQuery;
import com.gxyan.vo.OrderVo;


public interface IOrderService {
    ServerResponse addOrder(OrderVo orderVo);

    ServerResponse getList(OrderQuery orderQuery);

    ServerResponse update(Long orderId, String status);

    ServerResponse updateDetail(OrderDetails orderDetails);

    ServerResponse deleteDetail(String id);

    ServerResponse getDetailsList(DetailsQuery detailsQuery);
}
