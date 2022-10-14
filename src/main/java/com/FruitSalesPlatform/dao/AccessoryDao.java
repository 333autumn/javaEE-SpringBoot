package com.FruitSalesPlatform.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface AccessoryDao {

    void deleteByFruitId(@Param("fruitid") String fruitid);//删除一个产品下的所有附属品

    void deleteBatch(List<String> ids);//批量删除

}
