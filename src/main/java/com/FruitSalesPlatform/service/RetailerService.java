package com.FruitSalesPlatform.service;

import com.FruitSalesPlatform.entity.Retailer;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.vo.RetailerFuzzyVo;

import java.util.List;


public interface RetailerService {

    void deleteById(String retailerid);

    void insertOne(Retailer retailer);

    void updateById(Retailer retailer);

    Page<Retailer> findPages(Long pageNum,Long pageSize);//分页查询所有

    Page<Retailer> findListByKey(RetailerFuzzyVo vo);//分页模糊查询

    void changeStatus(String retailerid);//改变启用状态
}
