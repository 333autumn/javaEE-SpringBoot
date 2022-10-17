package com.FruitSalesPlatform.dao;


import com.FruitSalesPlatform.entity.Accessory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface AccessoryDao {

    List<Accessory> selectByFruitId(@Param("fruitid") String fruitid);//获取一个货物下的所有附属品

    void deleteBatch(List<String> ids);//批量删除

    void deleteByFruitId(@Param("fruitid") String fruitid);//删除一个货物下的所有附属品

    void insertOne(Accessory accessory);

}
