package com.wangjinqiao.conveniencestore.mapper;

import com.wangjinqiao.conveniencestore.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

// 库存批次表的数据库操作接口
@Mapper
public interface InventoryMapper {
    // 查询所有库存批次
    List<Inventory> findAll();
    // 根据ID查询库存批次
    Inventory findById(Long id);
    // 根据商品ID查询库存批次
    List<Inventory> findByProductId(Long productId);
    // 新增库存批次
    int insert(Inventory inventory);
    // 修改库存批次
    int update(Inventory inventory);
    // 删除库存批次
    int deleteById(Long id);
}