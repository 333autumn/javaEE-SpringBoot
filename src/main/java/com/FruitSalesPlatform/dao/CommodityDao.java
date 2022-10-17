package com.FruitSalesPlatform.dao;


import com.FruitSalesPlatform.entity.Commodity;
import com.FruitSalesPlatform.entity.Retailer;
import com.FruitSalesPlatform.vo.CommodityFuzzyVo;
import com.FruitSalesPlatform.vo.CommodityVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommodityDao {

    void deleteById(@Param("fruitid") String fruitid);

    void insertOne(Commodity commodity);

    void updateById(Commodity commodity);

    List<Commodity> findPages(@Param("pageNum") Long pageNum, @Param("pageSize") Long pageSize);//分页查询所有

    List<Commodity> findPagesByKey(CommodityFuzzyVo vo);//模糊查询

    Long count(); //返回记录条数

    Long countByKey(CommodityFuzzyVo vo);//查询符合条件的条数

    Retailer selectById(@Param("fruitid") String fruitid);

    List<CommodityVo> findList();

    List<CommodityVo> findListByKey(@Param("key") String key);


}
