package com.yanggle.order.server.controller;

import com.yanggle.common.vo.Result;
import com.yanggle.order.server.service.OrderService;
import com.yanggle.product.common.dto.ProductOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/test")
    public Result test() {
        return orderService.test();
    }
}
