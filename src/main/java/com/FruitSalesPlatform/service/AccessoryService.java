package com.FruitSalesPlatform.service;

import com.FruitSalesPlatform.entity.Accessory;

import java.util.List;

public interface AccessoryService {

    List<Accessory> selectByFruitId(String fruitid);//获取一个产品下的所有附属品

    void deleteBatch(List<String> ids);//批量删除

    void deleteByFruitId(String fruitid);//删除一个货物下的所有附属品

    void insertOne(Accessory accessory);

}
