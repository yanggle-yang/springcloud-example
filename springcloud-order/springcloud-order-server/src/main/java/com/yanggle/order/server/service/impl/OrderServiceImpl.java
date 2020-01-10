package com.yanggle.order.server.service.impl;

import com.yanggle.common.vo.Result;
import com.yanggle.order.server.service.OrderService;
import com.yanggle.product.client.ProductClient;
import com.yanggle.product.common.dto.ProductOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    ProductClient productClient;
    @Override
    public Result test() {
        return Result.success(productClient.test()) ;
    }
}
