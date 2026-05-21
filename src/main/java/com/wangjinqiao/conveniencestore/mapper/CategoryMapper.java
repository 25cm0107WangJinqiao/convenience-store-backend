package com.wangjinqiao.conveniencestore.mapper;

import com.wangjinqiao.conveniencestore.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

// 分类表的数据库操作接口
@Mapper
public interface CategoryMapper {
    // 查询所有分类，返回一个Category列表
    List<Category> findAll();
    // 根据id查询一个分类，返回一个Category对象
    Category findById(Long id);
    // 新增一个分类，返回影响的行数（成功返回1）。
    int insert(Category category);
    // 修改一个分类，返回影响的行数。
    int update(Category category);
    // 根据id删除一个分类，返回影响的行数。
    int deleteById(Long id);
}

/*
CategoryMapper就是一份菜单，列出了厨房能做哪些事：
findAll = 「把所有分类都端上来」
findById = 「把id是X的分类端上来」
insert = 「新加一个分类进去」
update = 「修改某个分类」
deleteById = 「删掉id是X的分类」
 */