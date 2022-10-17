package com.FruitSalesPlatform.controller;

import com.FruitSalesPlatform.service.impl.ContractServiceImpl;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.utils.R;
import com.FruitSalesPlatform.vo.ContractDetailVo;
import com.FruitSalesPlatform.vo.ContractFuzzyVo;
import com.FruitSalesPlatform.vo.ContractListVo;
import com.FruitSalesPlatform.vo.SaveContractVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contract")
@RequiredArgsConstructor
public class ContractController {

    private final ContractServiceImpl contractService;

    @GetMapping("/findDetail")
    public R findDetail(@RequestParam("contractid")String contractid){
        ContractDetailVo detail = contractService.findDetail(contractid);
        return R.success().put(detail);
    }

    @GetMapping("/findPages")
    public R findPages(@RequestParam(required = false)Long pageNum,
                       @RequestParam(required = false)Long pageSize){
        Page<ContractListVo> pages = contractService.findPages(pageNum,pageSize);
        return R.success().put(pages);
    }

    @PostMapping("/findPagesByKey")
    public R findPagesByKey(@RequestBody ContractFuzzyVo vo){
        Page<ContractListVo> pages = contractService.findPagesByKey(vo);
        return R.success().put(pages);
    }

    @PostMapping("/insert")
    public R insert(@RequestBody SaveContractVo vo){
        contractService.saveContract(vo);
        return R.success();
    }

    @PostMapping("/delete")
    public R delete(String contractid){
        contractService.delete(contractid);
        return R.success();
    }

}
