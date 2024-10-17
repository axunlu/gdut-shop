package com.example.shopbanner.controller;


import com.example.shopbanner.pojo.Banner;
import com.example.shopbanner.pojo.BannerDTO;
import com.example.shopbanner.pojo.R;
import com.example.shopbanner.service.BannerService;

import io.swagger.annotations.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/banner/")
@CrossOrigin
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @GetMapping(value = "/getAllBanners")
    public R getAllBanner(@RequestParam(name = "distributionSite", defaultValue = "1") int distributionSite) {
        List<Banner> banners = bannerService.list();

        // 商品分类轮播图
        if (distributionSite == 2) {
            Random random = new Random();
            Collections.shuffle(banners, random);
            String[] randomImages = {
                    "http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/dfc11bb0-4af5-4e9b-9458-99f615cc685a.jpg",
                    "http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/4a79180a-1a5a-4042-8a77-4db0b9c800a8.jpg",
                    "http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/1ba86bcc-ae71-42a3-bc3e-37b662f7f07e.jpg",
                    "http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/6d202d8e-bb47-4f92-9523-f32ab65754f4.jpg",
                    "http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-04-15/e83efb1b-309c-46f7-98a3-f1fefa694338.jpg"
            };
            for (int i = randomImages.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                String temp = randomImages[i];
                randomImages[i] = randomImages[j];
                randomImages[j] = temp;
            }
            for (int i = 0; i < banners.size(); i++) {
                banners.get(i).setImgUrl(randomImages[i % randomImages.length]);
            }
        }
        List<BannerDTO> BannerDTOs = new ArrayList<>();
        for (int i = 0; i < banners.size(); i++) {
            BannerDTO bannerDTO = new BannerDTO();
            bannerDTO.setId(banners.get(i).getBannerId()+"");
            bannerDTO.setHrefUrl(banners.get(i).getHrefUrl());
            bannerDTO.setImgUrl(banners.get(i).getImgUrl());
            bannerDTO.setType(banners.get(i).getBannerType()+"");
            BannerDTOs.add(bannerDTO);
        }
        return R.ok("查询所有数据图片成功",BannerDTOs);
    }


/*    @PostMapping(value = "/addBanner")
    public R addBanner(@RequestBody Banner banner) {
        boolean flag = bannerService.save(banner);
        if (flag) {
            return R.ok("增加轮播图成功");
        } else {
            return R.error("增加轮播图失败");
        }
    }


    @DeleteMapping(value = "/deleteBanner/{id}")
    public R deleteBanner(@PathVariable("id") Integer bannerId) {
        boolean flag = bannerService.removeById(bannerId);
        if (flag) {
            return R.ok("删除轮播图成功");
        } else {
            return R.error("删除轮播图失败");
        }
    }*/

/*    @GetMapping(value = "/getBannerById/{id}")
    public R getByIdBanner(@PathVariable("id") Integer bannerId) {
        Banner banner = bannerService.getById(bannerId);
        return R.ok("按照轮播图编号查询数据成功").data("banner", banner);
    }

    @PutMapping(value = "/updateBanner")
    public R updateBanner(@RequestBody Banner banner) {
        boolean flag = bannerService.updateById(banner);
        if (flag) {
            return R.ok("修改轮播图成功");
        } else {
            return R.error("修改轮播图失败");
        }
    }*/
}
