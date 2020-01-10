package com.yanggle.product.client;

import com.yanggle.common.vo.Result;
import com.yanggle.product.common.dto.ProductOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="APP-PRODUCT")
public interface ProductClient {
    @GetMapping("/product/test")
    public ProductOutput test();

}
