package com.imooc.cloudclient.dao;

import com.imooc.cloudclient.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lizj on 2018/10/12
 */

public interface ProductDao extends JpaRepository<Product,Integer> {
}
