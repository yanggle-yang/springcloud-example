package com.yanggle.product.server.controller;

import com.yanggle.common.vo.Result;
import com.yanggle.product.common.dto.ProductOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/test")
    public ProductOutput test() {

        ProductOutput out = new ProductOutput();
        out.setProductId("1");
        out.setProductName("香烟");

        return out;
    }
}