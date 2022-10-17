package com.FruitSalesPlatform.service.impl;

import com.FruitSalesPlatform.dao.CommodityDao;
import com.FruitSalesPlatform.entity.Commodity;
import com.FruitSalesPlatform.service.CommodityService;
import com.FruitSalesPlatform.utils.IDUtil;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.vo.CommodityFuzzyVo;
import com.FruitSalesPlatform.vo.CommodityVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
public class CommodityServiceImpl implements CommodityService {

    private final CommodityDao commodityDao;

    private final AccessoryServiceImpl accessoryService;


    @Override
    @Transactional
    public void deleteById(String fruitid) {
        commodityDao.deleteById(fruitid);
        //删除货物下的所有附属品
        accessoryService.deleteByFruitId(fruitid);
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
    public Page<Commodity> findPagesByKey(CommodityFuzzyVo vo) {
        Page<Commodity> page=new Page<>();
        List<Commodity> commodities = commodityDao.findPagesByKey(vo);
        Long total = commodityDao.countByKey(vo);
        page.setTotal(total);
        page.setRows(commodities);
        return page;
    }

    @Override
    public List<CommodityVo> findList() {
        return commodityDao.findList();
    }

    @Override
    public List<CommodityVo> findListByKey(String key) {
        return commodityDao.findListByKey(key);
    }

}
