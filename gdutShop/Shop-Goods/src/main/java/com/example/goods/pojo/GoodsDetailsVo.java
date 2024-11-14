package com.example.goods.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class GoodsDetailsVo {
    private Integer detailsId;
    private List< String > detailsPictures;
    private GoodsProperty goodsProperty;
}
