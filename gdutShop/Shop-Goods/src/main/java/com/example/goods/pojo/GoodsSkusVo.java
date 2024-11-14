package com.example.goods.pojo;

import lombok.Data;

@Data
public class GoodsSkusVo {
    private Integer skuId;
    private Integer skuInventory;
    private Double skuOldPrice;
    private String skuPrice;
    private Integer skuCode;
    private SkusSpec skusSpec;
}
