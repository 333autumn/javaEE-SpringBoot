package com.FruitSalesPlatform.controller;


import com.FruitSalesPlatform.entity.Retailer;
import com.FruitSalesPlatform.service.impl.RetailerServiceImpl;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.utils.R;
import com.FruitSalesPlatform.vo.RetailerFuzzyVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/retailer")
@RequiredArgsConstructor
public class RetailerController {

    private final RetailerServiceImpl retailerService;

    @GetMapping("/findPages")
    public R findPages(@RequestParam(required = false)Long pageNum,
                       @RequestParam(required = false)Long pageSize){
        Page<Retailer> pages = retailerService.findPages(pageNum, pageSize);
        return R.success().put(pages);
    }

    @PostMapping("/insert")
    public R insert(@RequestBody Retailer retailer){
        retailerService.insertOne(retailer);
        return R.success();
    }

    @PostMapping("/delete")
    public R delete(String retailerid){
        retailerService.deleteById(retailerid);
        return R.success();
    }

    @PostMapping("/update")
    public R update(@RequestBody Retailer retailer){
        retailerService.updateById(retailer);
        return R.success();
    }

    @PostMapping("/change")
    public R change(String retailerid){
        retailerService.changeStatus(retailerid);
        return R.success();
    }

    @PostMapping("/fuzzy")
    public R fuzzy(@RequestBody RetailerFuzzyVo vo){
        Page<Retailer> pages = retailerService.findListByKey(vo);
        return R.success().put(pages);
    }

}
