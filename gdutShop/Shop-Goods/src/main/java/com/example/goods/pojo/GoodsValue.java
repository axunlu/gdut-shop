package com.example.goods.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsValue {
    @TableId(type = IdType.AUTO)
    private Integer valueId;
    private String valueDec;
    private String valueName;
    private String valuePicture;
}
