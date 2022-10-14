package com.FruitSalesPlatform.service;

import com.FruitSalesPlatform.entity.Commodity;
import com.FruitSalesPlatform.entity.Retailer;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.vo.CommodityFuzzyVo;


public interface CommodityService {

    void deleteById(String fruitid);

    void insertOne(Commodity commodity);

    void updateById(Commodity commodity);

    Page<Commodity> findPages(Long pageNum,Long pageSize);//分页查询所有

    Page<Commodity> findListByKey(CommodityFuzzyVo vo);//模糊查询

}
