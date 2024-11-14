package com.example.goods.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderSpec {
    @TableId(type = IdType.AUTO)
    private Integer orderSpecId;
    private Integer orderSpecQuantity;
    private Date createTime;
}
