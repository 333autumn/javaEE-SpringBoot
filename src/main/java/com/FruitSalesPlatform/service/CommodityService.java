package com.FruitSalesPlatform.service;

import com.FruitSalesPlatform.entity.Commodity;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.vo.CommodityFuzzyVo;
import com.FruitSalesPlatform.vo.CommodityVo;

import java.util.List;


public interface CommodityService {

    void deleteById(String fruitid);

    void insertOne(Commodity commodity);

    void updateById(Commodity commodity);

    Page<Commodity> findPages(Long pageNum,Long pageSize);//分页查询所有

    Page<Commodity> findPagesByKey(CommodityFuzzyVo vo);//模糊查询

    List<CommodityVo> findList();

    List<CommodityVo> findListByKey(String key);

}
