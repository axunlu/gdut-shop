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

    @GetMapping(value = "/getAllBanners")/*lx*/
    public R getAllBanner(@RequestParam(name = "distributionSite", defaultValue = "1") int distributionSite) {
        List<Banner> banners = bannerService.list();

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



}
