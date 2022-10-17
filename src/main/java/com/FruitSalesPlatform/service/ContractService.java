package com.FruitSalesPlatform.service;

import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.vo.ContractDetailVo;
import com.FruitSalesPlatform.vo.ContractFuzzyVo;
import com.FruitSalesPlatform.vo.ContractListVo;
import com.FruitSalesPlatform.vo.SaveContractVo;

import java.util.List;

public interface ContractService {

    ContractDetailVo findDetail(String contractid);

    void saveContract(SaveContractVo vo);

    Page<ContractListVo> findPages(Long pageNum, Long pageSize);

    Page<ContractListVo> findPagesByKey(ContractFuzzyVo vo);

    void delete(String contractid);

}
