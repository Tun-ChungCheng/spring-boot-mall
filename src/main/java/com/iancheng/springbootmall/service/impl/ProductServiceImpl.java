package com.iancheng.springbootmall.service.impl;

import com.iancheng.springbootmall.dao.ProductDao;
import com.iancheng.springbootmall.model.Product;
import com.iancheng.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}