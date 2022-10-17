package com.FruitSalesPlatform.dao;


import com.FruitSalesPlatform.entity.MiddleTab;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MiddleTabDao {

    //删除合同与货物关联的所有中间表信息
    void deleteByContractId(@Param("contractid") String contractid);

    void insertOne(MiddleTab middleTab);

}
