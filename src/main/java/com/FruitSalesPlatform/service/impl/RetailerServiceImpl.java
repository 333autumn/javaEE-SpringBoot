package com.FruitSalesPlatform.service.impl;

import com.FruitSalesPlatform.dao.RetailerDao;
import com.FruitSalesPlatform.entity.Retailer;
import com.FruitSalesPlatform.service.RetailerService;
import com.FruitSalesPlatform.utils.IDUtil;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.vo.RetailerFuzzyVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RetailerServiceImpl implements RetailerService {

    private final RetailerDao retailerDao;

    @Override
    public void deleteById(String retailerid) {
        retailerDao.deleteById(retailerid);
    }

    @Override
    public void insertOne(Retailer retailer) {
        retailer.setRetailerid(IDUtil.getId());
        retailer.setCreatetime(LocalDateTime.now());
        //默认启用
        retailer.setStatus(1);
        retailerDao.insertOne(retailer);
    }

    @Override
    public void updateById(Retailer retailer) {
        retailerDao.updateById(retailer);
    }

    @Override
    public Page<Retailer> findPages(Long pageNum,Long pageSize) {
        Page<Retailer> page=new Page<>();
        Long total=retailerDao.count();
        List<Retailer> retailers = retailerDao.findPages(pageNum, pageSize);
        page.setTotal(total);
        page.setRows(retailers);
        return page;
    }

    @Override
    public Page<Retailer> findPagesByKey(RetailerFuzzyVo vo) {
        Page<Retailer> page=new Page<>();
        List<Retailer> retailers = retailerDao.findPagesByKey(vo);
        Long total = retailerDao.countByKey(vo);
        page.setTotal(total);
        page.setRows(retailers);
        return page;
    }

    @Override
    public void changeStatus(String retailerid) {
        Retailer retailer = retailerDao.selectById(retailerid);
        Integer status = retailer.getStatus();
        if (status==0){
            retailerDao.changeStatus(retailerid,1);
        }else {
            retailerDao.changeStatus(retailerid,0);
        }
    }

    @Override
    public List<Retailer> findList() {
        return retailerDao.findList();
    }

}
