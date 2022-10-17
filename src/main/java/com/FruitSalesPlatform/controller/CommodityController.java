package com.FruitSalesPlatform.controller;

import com.FruitSalesPlatform.entity.Commodity;
import com.FruitSalesPlatform.service.impl.CommodityServiceImpl;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.utils.R;
import com.FruitSalesPlatform.vo.CommodityFuzzyVo;
import com.FruitSalesPlatform.vo.CommodityVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commodity")
@RequiredArgsConstructor
public class CommodityController {

    private final CommodityServiceImpl commodityService;

    @GetMapping("/findPages")
    public R findPages(@RequestParam(required = false)Long pageNum,
                       @RequestParam(required = false)Long pageSize){
        Page<Commodity> pages = commodityService.findPages(pageNum, pageSize);
        return R.success().put(pages);
    }

    @GetMapping("/findList")
    public R findList(){
        List<CommodityVo> list = commodityService.findList();
        return R.success().put(list);
    }

    @GetMapping("/findListByKey")
    public R findListByKey(@RequestParam("key")String key){
        List<CommodityVo> list = commodityService.findListByKey(key);
        return R.success().put(list);
    }

    @PostMapping("/insert")
    public R insert(@RequestBody Commodity commodity){
       commodityService.insertOne(commodity);
        return R.success();
    }

    @PostMapping("/delete")
    public R delete(String fruitid){
        commodityService.deleteById(fruitid);
        return R.success();
    }

    @PostMapping("/update")
    public R update(@RequestBody Commodity commodity){
        commodityService.updateById(commodity);
        return R.success();
    }

    @PostMapping("/fuzzy")
    public R fuzzy(@RequestBody CommodityFuzzyVo vo){
        Page<Commodity> pages = commodityService.findPagesByKey(vo);
        return R.success().put(pages);
    }

}
