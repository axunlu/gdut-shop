package com.example.hot.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.example.goods.pojo.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(autoResultMap = true)
public class HotGoods {
    @TableId(type = IdType.AUTO)
    private Integer hotGoodsId;
    @TableField(value = "hot_id", target = Hot.class)
    private Integer HotId;
    @TableField(relation = Relation.MANY_TO_MANY)
    private Hot hot;
    @TableField(value = "goods_id", target = Goods.class)
    private Integer goodsId;
    @TableField(relation = Relation.MANY_TO_MANY)
    private Goods goods;
}
