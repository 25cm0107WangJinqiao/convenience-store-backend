package com.wangjinqiao.conveniencestore.mapper;

import com.wangjinqiao.conveniencestore.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
    // 入库：增加库存数量
    int addStock(@Param("id") Long id, @Param("quantity") int quantity);
    // 出库：减少库存数量
    int reduceStock(@Param("id") Long id, @Param("quantity") int quantity);
    // 查询低库存批次（数量小于等于threshold）
    List<Inventory> findLowStock(@Param("threshold") int threshold);
    // 查询即将过期或已过期的批次
    List<Inventory> findExpiringSoon();
}