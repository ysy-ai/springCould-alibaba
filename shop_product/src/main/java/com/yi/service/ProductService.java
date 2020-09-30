package com.yi.service;

import com.yi.domain.Product;

public interface ProductService {
    //查询商品信息
    Product findByPid(Integer pid);
}
