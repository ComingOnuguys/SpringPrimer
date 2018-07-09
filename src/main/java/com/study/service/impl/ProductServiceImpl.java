package com.study.service.impl;

import com.study.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author frankwin608
 * @create 2018-07-09 23:56
 * @desc 商品服务实现类
 **/
@Service
public class ProductServiceImpl implements ProductService{

    @Override
    public String queryProductNameById(String id) {
        return "Hello Kitty";
    }
}
