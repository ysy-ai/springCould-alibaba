package com.yi.service.impl;

import com.yi.dao.ProductDao;
import com.yi.domain.Product;
import com.yi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired(required = false)
    private ProductDao productDao;
    /**
     * 查询商品信息
     */
    @Override
    public Product findByPid(Integer pid) {
        return productDao.findById(pid).get();
    }
}
