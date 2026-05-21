package com.wangjinqiao.conveniencestore.controller;

import com.wangjinqiao.conveniencestore.entity.Category;
import com.wangjinqiao.conveniencestore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// 分类的请求接收层
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // 查询所有分类 GET /api/categories
    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    // 根据ID查询分类 GET /api/categories/1
    @GetMapping("/{id}")
    public Category findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    // 新增分类 POST /api/categories
    @PostMapping
    public int insert(@RequestBody Category category) {
        return categoryService.insert(category);
    }

    // 修改分类 PUT /api/categories
    @PutMapping
    public int update(@RequestBody Category category) {
        return categoryService.update(category);
    }

    // 删除分类 DELETE /api/categories/1
    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable Long id) {
        return categoryService.deleteById(id);
    }
}