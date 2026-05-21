package com.wangjinqiao.conveniencestore.controller;

import com.wangjinqiao.conveniencestore.entity.Product;
import com.wangjinqiao.conveniencestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// 商品的请求接收层
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // 查询所有商品 GET /api/products
    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    // 根据ID查询商品 GET /api/products/1
    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    // 根据分类ID查询商品 GET /api/products/category/1
    @GetMapping("/category/{categoryId}")
    public List<Product> findByCategoryId(@PathVariable Long categoryId) {
        return productService.findByCategoryId(categoryId);
    }

    // 新增商品 POST /api/products
    @PostMapping
    public int insert(@RequestBody Product product) {
        return productService.insert(product);
    }

    // 修改商品 PUT /api/products
    @PutMapping
    public int update(@RequestBody Product product) {
        return productService.update(product);
    }

    // 删除商品 DELETE /api/products/1
    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable Long id) {
        return productService.deleteById(id);
    }
}