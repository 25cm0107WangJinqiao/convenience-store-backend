package com.wangjinqiao.conveniencestore.service;

import com.wangjinqiao.conveniencestore.entity.Category;
import com.wangjinqiao.conveniencestore.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// 分类的业务逻辑层
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    // 查询所有分类
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

    // 根据ID查询分类
    public Category findById(Long id) {
        return categoryMapper.findById(id);
    }

    // 新增分类
    public int insert(Category category) {
        return categoryMapper.insert(category);
    }

    // 修改分类
    public int update(Category category) {
        return categoryMapper.update(category);
    }

    // 删除分类
    public int deleteById(Long id) {
        return categoryMapper.deleteById(id);
    }
}