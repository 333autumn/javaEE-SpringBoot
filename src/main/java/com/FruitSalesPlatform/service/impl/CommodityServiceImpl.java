package com.FruitSalesPlatform.service.impl;

import com.FruitSalesPlatform.dao.CommodityDao;
import com.FruitSalesPlatform.entity.Commodity;
import com.FruitSalesPlatform.service.CommodityService;
import com.FruitSalesPlatform.utils.IDUtil;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.vo.CommodityFuzzyVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
public class CommodityServiceImpl implements CommodityService {

    private final CommodityDao commodityDao;


    @Override
    public void deleteById(String fruitid) {
        commodityDao.deleteById(fruitid);
    }

    @Override
    public void insertOne(Commodity commodity) {
        commodity.setFruitid(IDUtil.getId());
        commodity.setCreatetime(LocalDateTime.now());
        commodityDao.insertOne(commodity);
    }

    @Override
    public void updateById(Commodity commodity) {
        commodityDao.updateById(commodity);
    }

    @Override
    public Page<Commodity> findPages(Long pageNum, Long pageSize) {
        Page<Commodity> page=new Page<>();
        List<Commodity> commodities = commodityDao.findPages(pageNum, pageSize);
        Long total = commodityDao.count();
        page.setTotal(total);
        page.setRows(commodities);
        return page;
    }

    @Override
    public Page<Commodity> findListByKey(CommodityFuzzyVo vo) {
        Page<Commodity> page=new Page<>();
        List<Commodity> commodities = commodityDao.findListByKey(vo);
        Long total = commodityDao.countByKey(vo);
        page.setTotal(total);
        page.setRows(commodities);
        return page;
    }
}
