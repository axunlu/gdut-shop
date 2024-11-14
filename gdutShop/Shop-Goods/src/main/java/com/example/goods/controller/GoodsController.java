package com.example.goods.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.goods.pojo.Goods;
import com.example.goods.pojo.GoodsBrand;
import com.example.goods.pojo.GoodsParticulars;
import com.example.goods.pojo.GoodsParticularsVo;
import com.example.goods.service.GoodsBrandService;
import com.example.goods.service.GoodsParticularsService;
import com.example.goods.service.GoodsService;
import com.example.smartcommon.util.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/goods/")
@Tag(name = "显示商品") // Swagger文档的标签，用于显示商品模块
public class GoodsController {

    @Autowired
    private GoodsService goodsService; // 注入商品服务类
    @Autowired
    private GoodsParticularsService goodsParticularsService; // 注入商品详情服务类
    @Autowired
    private GoodsBrandService goodsBrandService; // 注入商品品牌服务类

    @Operation(summary = "获得所有的商品") // Swagger文档的操作描述
    @GetMapping(value = "/getAllGoods")
    public R getAllGoods() {
        List<Goods> goods = goodsService.list(); // 查询所有商品数据
        return R.ok("查询所有商品成功").data("goodsList", goods); // 返回查询结果
    }

    @Operation(summary = "猜你喜欢商品带分页") // Swagger文档的操作描述
    @GetMapping(value = "/guessLikeGoods")
    public R guessLikeGoods(@RequestParam(name = "page", defaultValue = "1") Long page,
                            @RequestParam(name = "pageSize", defaultValue = "10") Long pageSize) {
        // 分页功能进行查询
        Page<Goods> goodsPage = new Page<>(page, pageSize);
        // 条件构造器
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        // 随机排序
        queryWrapper.orderByDesc("rand()");
        // 查询数据
        goodsService.page(goodsPage, queryWrapper);

        // 每页的数据集合
        List<Goods> goodsList = goodsPage.getRecords();
        // 总的记录数
        Long counts = goodsPage.getTotal();
        // 每页条数
        pageSize = goodsPage.getSize();
        // 总页数
        Long pages = goodsPage.getPages();
        // 当前页数
        page = goodsPage.getCurrent();

        // 将分页信息存储到Map中
        Map<String, Object> map = new HashMap<>();
        map.put("counts", counts);
        map.put("pageSize", pageSize);
        map.put("pages", pages);
        map.put("page", page);
        map.put("goodsList", goodsList);

        return R.ok("猜你喜欢商品带分页成功").data(map); // 返回分页查询结果
    }

    @Operation(summary = "增加商品") // Swagger文档的操作描述
    @PostMapping(value = "/addGoods")
    public R addGoods(@RequestBody Goods goods) {
        boolean flag = goodsService.save(goods); // 保存商品数据
        if (flag) {
            return R.ok("增加商品成功");
        } else {
            return R.error("增加商品失败");
        }
    }

    @Operation(summary = "删除商品数据") // Swagger文档的操作描述
    @DeleteMapping(value = "/deleteGoods/{id}")
    public R deleteGoods(@PathVariable("id") Integer goodsId) {
        boolean flag = goodsService.removeById(goodsId); // 根据ID删除商品
        if (flag) {
            return R.ok("删除商品成功");
        } else {
            return R.error("删除商品失败");
        }
    }

    @Operation(summary = "按照商品编号查询数据") // Swagger文档的操作描述
    @GetMapping(value = "/getGoodsById/{id}")
    public R getGoodsById(@PathVariable("id") Integer goodsId) {
        Goods goods = goodsService.getById(goodsId); // 根据商品ID查询商品
        return R.ok("按照商品编号查询数据成功").data("goods", goods); // 返回查询结果
    }

    @Operation(summary = "按照商品详情编号联表查询数据") // Swagger文档的操作描述
    @GetMapping(value = "/getGoodsById")
    public R getGoodsByIds(@RequestParam("goodsId") Integer goodsId) {
        List<GoodsParticularsVo> goodsParticularsVoList = new ArrayList<>();

        // 查询商品详情
        GoodsParticulars goodsParticulars = goodsParticularsService.getById(goodsId);
        // 查询商品信息
        Goods goods = goodsService.getById(goodsId);
        // 查询商品品牌信息
        GoodsBrand goodsBrand = goodsBrandService.getById(goodsParticulars.getBrandId());

        // 将商品详情属性复制到商品详情视图对象中
        GoodsParticularsVo goodsParticularsVo = new GoodsParticularsVo();
        BeanUtils.copyProperties(goodsParticularsVo, goodsParticulars);
        goodsParticularsVo.setGoodsId(goods.getGoodsId());
        goodsParticularsVo.setGoodsName(goods.getGoodsName());
        goodsParticularsVo.setGoodsDesc(goods.getGoodsDesc());
        goodsParticularsVo.setGoodsPrice(goods.getGoodsPrice());
        goodsParticularsVo.setGoodsBrand(goodsBrand);

        goodsParticularsVoList.add(goodsParticularsVo);

        return R.ok("按照商品详情编号查询数据成功").data("goods", goodsParticularsVoList); // 返回联表查询结果
    }

    @Operation(summary = "修改商品数据") // Swagger文档的操作描述
    @PutMapping(value = "/updateGoods")
    public R updateGoods(@RequestBody Goods goods) {
        boolean flag = goodsService.updateById(goods); // 更新商品数据
        if (flag) {
            return R.ok("修改商品成功");
        } else {
            return R.error("修改商品失败");
        }
    }
}
