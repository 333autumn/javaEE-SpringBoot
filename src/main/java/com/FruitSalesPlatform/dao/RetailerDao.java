package com.FruitSalesPlatform.dao;

import com.FruitSalesPlatform.entity.Retailer;
import com.FruitSalesPlatform.vo.RetailerFuzzyVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RetailerDao {

    void deleteById(@Param("retailerid") String retailerid);

    void insertOne(Retailer retailer);

    void updateById(Retailer retailer);

    List<Retailer> findPages(@Param("pageNum") Long pageNum,@Param("pageSize") Long pageSize);//分页查询所有

    List<Retailer> findPagesByKey(RetailerFuzzyVo vo);//模糊查询

    void changeStatus(@Param("retailerid")String retailerid,@Param("status")Integer status);//改变启用状态

    Retailer selectById(@Param("retailerid") String retailerid);

    Long count(); //返回记录条数

    Long countByKey(RetailerFuzzyVo vo);//查询符合条件的条数

    List<Retailer> findList();

}
