package com.wangjinqiao.conveniencestore.entity;

import lombok.Data;
import java.time.LocalDateTime;

// 定义分类表categories的模版
@Data
public class Category {
    // 分类ID
    private Long id;
    // 分类名称
    private String name;
    // 创建时间
    private LocalDateTime createdAt;
}