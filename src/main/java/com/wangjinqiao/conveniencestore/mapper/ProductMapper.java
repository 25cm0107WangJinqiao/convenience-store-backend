package com.wangjinqiao.conveniencestore.mapper;

import com.wangjinqiao.conveniencestore.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

// 商品表的数据库操作接口
@Mapper
public interface ProductMapper {
    // 查询所有商品
    List<Product> findAll();
    // 根据ID查询商品
    Product findById(Long id);
    // 根据分类ID查询商品
    List<Product> findByCategoryId(Long categoryId);
    // 新增商品
    int insert(Product product);
    // 修改商品
    int update(Product product);
    // 删除商品
    int deleteById(Long id);
}