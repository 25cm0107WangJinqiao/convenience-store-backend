package com.wangjinqiao.conveniencestore.service;

import com.wangjinqiao.conveniencestore.entity.Product;
import com.wangjinqiao.conveniencestore.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// 商品的业务逻辑层
@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    // 查询所有商品
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    // 根据ID查询商品
    public Product findById(Long id) {
        return productMapper.findById(id);
    }

    // 根据分类ID查询商品
    public List<Product> findByCategoryId(Long categoryId) {
        return productMapper.findByCategoryId(categoryId);
    }

    // 新增商品
    public int insert(Product product) {
        return productMapper.insert(product);
    }

    // 修改商品
    public int update(Product product) {
        return productMapper.update(product);
    }

    // 删除商品
    public int deleteById(Long id) {
        return productMapper.deleteById(id);
    }
}