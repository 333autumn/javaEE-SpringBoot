package com.FruitSalesPlatform.service.impl;

import com.FruitSalesPlatform.dao.ContractDao;
import com.FruitSalesPlatform.dao.MiddleTabDao;
import com.FruitSalesPlatform.entity.Contract;
import com.FruitSalesPlatform.entity.MiddleTab;
import com.FruitSalesPlatform.service.ContractService;
import com.FruitSalesPlatform.utils.IDUtil;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.vo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements ContractService {

    private final ContractDao contractDao;

    private final MiddleTabDao middleTabDao;

    @Override
    public ContractDetailVo findDetail(String contractid) {
        return contractDao.findDetail(contractid);
    }

    @Override
    @Transactional
    public void saveContract(SaveContractVo vo) {
        //保存合同信息
        Contract contract = new Contract();
        String contractid = IDUtil.getId();
        contract.setContractid(contractid);
        //根据当前日期和第几单生成barcode
        contract.setBarcode(getCode());
        contract.setType(vo.getType());
        contract.setRetailerid(vo.getRetailerid());
        contract.setCreatetime(LocalDateTime.now());
        contractDao.insertOne(contract);
        //保存中间表信息
        List<MiddleFruitVo> fruits = vo.getFruits();
        for (MiddleFruitVo fruit : fruits) {
            MiddleTab middleTab = new MiddleTab();
            middleTab.setMiddleid(IDUtil.getId());
            middleTab.setFruitid(fruit.getFruitid());
            middleTab.setContractid(contractid);
            middleTab.setNumber(fruit.getNumber());
            middleTabDao.insertOne(middleTab);
        }
    }

    @Override
    public Page<ContractListVo> findPages(Long pageNum, Long pageSize) {
        Page<ContractListVo> page=new Page<>();
        List<ContractListVo> row = contractDao.findPages(pageNum, pageSize);
        Long total = contractDao.count();
        page.setRows(row);
        page.setTotal(total);
        return page;
    }

    @Override
    public Page<ContractListVo> findPagesByKey(ContractFuzzyVo vo) {
        Page<ContractListVo> page=new Page<>();
        List<ContractListVo> row = contractDao.findPagesByKey(vo);
        Long total = contractDao.countByKey(vo);
        page.setRows(row);
        page.setTotal(total);
        return page;
    }

    @Override
    @Transactional
    public void delete(String contractid) {
        //删除合同信息
        contractDao.deleteById(contractid);
        //删除关联表中的信息
        middleTabDao.deleteByContractId(contractid);
    }

    /**
     * 生成购销合同编码
     */
    public String getCode(){
        String barcode="";
        //取当天的日期作为编码头部
        String codeHead=new SimpleDateFormat("yyyyMMdd").format(new Date());
        //从数据库中取出最大的编码
        String maxBarCode = contractDao.getMaxBarCode();
        if (Objects.nonNull(maxBarCode)){
            //如果最大日期为今天,则取其自增的部分
            if (maxBarCode.substring(0, 8).equals(codeHead)){
                 maxBarCode= maxBarCode.substring(8);
            }else {//不是今天,说明是今天的第一单
                maxBarCode="0";
            }
        }else {//说明数据库中没有数据,是系统第一单
            maxBarCode="0";
        }
        int max = Integer.parseInt(maxBarCode);
        max++;
        if (max<=9){
            barcode=codeHead+"000"+max;
        }else if (max<=99){
            barcode=codeHead+"00"+max;
        }else if (max<=999){
            barcode=codeHead+"0"+max;
        }else {
            barcode=codeHead+max;
        }
        return barcode;
    }

}
