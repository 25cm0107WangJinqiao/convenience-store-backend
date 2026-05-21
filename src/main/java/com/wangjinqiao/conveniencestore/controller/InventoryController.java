package com.wangjinqiao.conveniencestore.controller;

import com.wangjinqiao.conveniencestore.entity.Inventory;
import com.wangjinqiao.conveniencestore.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// 库存批次的请求接收层
@RestController
@RequestMapping("/api/inventories")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    // 查询所有库存批次 GET /api/inventories
    @GetMapping
    public List<Inventory> findAll() {
        return inventoryService.findAll();
    }

    // 根据ID查询库存批次 GET /api/inventories/1
    @GetMapping("/{id}")
    public Inventory findById(@PathVariable Long id) {
        return inventoryService.findById(id);
    }

    // 根据商品ID查询库存批次 GET /api/inventories/product/1
    @GetMapping("/product/{productId}")
    public List<Inventory> findByProductId(@PathVariable Long productId) {
        return inventoryService.findByProductId(productId);
    }

    // 新增库存批次 POST /api/inventories
    @PostMapping
    public int insert(@RequestBody Inventory inventory) {
        return inventoryService.insert(inventory);
    }

    // 修改库存批次 PUT /api/inventories
    @PutMapping
    public int update(@RequestBody Inventory inventory) {
        return inventoryService.update(inventory);
    }

    // 删除库存批次 DELETE /api/inventories/1
    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable Long id) {
        return inventoryService.deleteById(id);
    }
}