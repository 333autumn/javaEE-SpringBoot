package com.FruitSalesPlatform.controller;

import com.FruitSalesPlatform.entity.Accessory;
import com.FruitSalesPlatform.service.impl.AccessoryServiceImpl;
import com.FruitSalesPlatform.utils.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/accessory")
@RequiredArgsConstructor
public class AccessoryController {
    private final AccessoryServiceImpl accessoryService;

    @GetMapping("/findList")
    public R findList(String fruitid){
        List<Accessory> accessories = accessoryService.selectByFruitId(fruitid);
        return R.success().put(accessories);
    }

    @PostMapping("/insert")
    public R insert(@RequestBody Accessory accessory){
        accessoryService.insertOne(accessory);
        return R.success();
    }

    @PostMapping("/deleteBatch")
    public R delete(@RequestBody Map<String, Object> parameter) {
        List<String> ids = (List<String>) parameter.get("ids");
        accessoryService.deleteBatch(ids);
        return R.success();
    }

}
