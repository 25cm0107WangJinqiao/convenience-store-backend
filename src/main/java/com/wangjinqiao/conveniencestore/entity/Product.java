package com.wangjinqiao.conveniencestore.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// 定义商品表products的模版
@Data
public class Product {
    // 商品ID
    private Long id;
    // 分类ID
    private Long categoryId;
    // 商品名称
    private String name;
    // 售卖价格
    private BigDecimal sellingPrice;
    // 进价
    private BigDecimal costPrice;
    // 储存条件
    private String storageCondition;
    // 图片URL
    private String imageUrl;
    // 商品说明
    private String description;
    // 创建时间
    private LocalDateTime createdAt;
    // 更新时间
    private LocalDateTime updatedAt;
}