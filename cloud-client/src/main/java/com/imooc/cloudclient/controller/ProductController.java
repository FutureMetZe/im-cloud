package com.imooc.cloudclient.controller;

import com.imooc.cloudclient.dao.ProductDao;
import com.imooc.cloudclient.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lizj on 2018/10/12
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("/list")
    public List<Product> list(){
        return productDao.findAll();
    }
}
