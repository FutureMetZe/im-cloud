package com.imooc.cloudorder.controller;

import com.imooc.cloudorder.service.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizj on 2018/10/18
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    ProductClient productClient;

    @GetMapping("/product")
    public String getProduct(){
        return productClient.list();
    }
}
