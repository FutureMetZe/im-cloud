package com.imooc.cloudorder.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lizj on 2018/10/18
 */
@FeignClient("Euraka-PRODUCT")
public interface ProductClient {

    @GetMapping("/product/list")
    String list();
}
