package com.wangjinqiao.conveniencestore.service;

import com.wangjinqiao.conveniencestore.entity.Inventory;
import com.wangjinqiao.conveniencestore.mapper.InventoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// 库存批次的业务逻辑层
@Service
public class InventoryService {

    @Autowired
    private InventoryMapper inventoryMapper;

    // 查询所有库存批次
    public List<Inventory> findAll() {
        return inventoryMapper.findAll();
    }

    // 根据ID查询库存批次
    public Inventory findById(Long id) {
        return inventoryMapper.findById(id);
    }

    // 根据商品ID查询库存批次
    public List<Inventory> findByProductId(Long productId) {
        return inventoryMapper.findByProductId(productId);
    }

    // 新增库存批次
    public int insert(Inventory inventory) {
        return inventoryMapper.insert(inventory);
    }

    // 修改库存批次
    public int update(Inventory inventory) {
        return inventoryMapper.update(inventory);
    }

    // 删除库存批次
    public int deleteById(Long id) {
        return inventoryMapper.deleteById(id);
    }
}