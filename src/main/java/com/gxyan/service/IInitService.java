package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Brand;
import com.gxyan.vo.SeriesTree;

import java.util.List;

public interface IInitService {

    /**
     * 封装车系选择
     * @return
     */
    ServerResponse<List<SeriesTree>> seriesOpt();

    /**
     * 封装品牌选择
     * @return
     */
    ServerResponse<List<Brand>> brandOpt();

    ServerResponse storeOpt(Integer seriesId);

    ServerResponse getCustomer(String idCard);
}
