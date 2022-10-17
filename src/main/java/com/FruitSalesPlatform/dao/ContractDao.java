package com.FruitSalesPlatform.dao;


import com.FruitSalesPlatform.entity.Contract;
import com.FruitSalesPlatform.vo.ContractDetailVo;
import com.FruitSalesPlatform.vo.ContractFuzzyVo;
import com.FruitSalesPlatform.vo.ContractListVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface ContractDao {

    List<ContractListVo> findPages(@Param("pageNum") Long pageNum, @Param("pageSize") Long pageSize);//分页查询所有

    List<ContractListVo> findPagesByKey(ContractFuzzyVo vo);
    ContractDetailVo findDetail(@Param("contractid")String contractid);

    void deleteById(@Param("contractid")String contractid);

    void insertOne(Contract contract);

    Long count(); //返回记录条数

    Long countByKey(ContractFuzzyVo vo);

    String getMaxBarCode();//获取最大的合同编号
}
