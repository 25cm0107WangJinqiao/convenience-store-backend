package com.wangjinqiao.conveniencestore.entity;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

// 定义库存批次表inventories的模版
@Data
public class Inventory {
    // 库存批次ID
    private Long id;
    // 商品ID
    private Long productId;
    // 库存数量
    private Integer quantity;
    // 生产日期
    private LocalDate productionDate;
    // 保质期天数
    private Integer expiryDays;
    // 批次说明
    private String description;
    // 创建时间
    private LocalDateTime createdAt;
    // 更新时间
    private LocalDateTime updatedAt;
}