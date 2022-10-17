package com.FruitSalesPlatform.service.impl;

import com.FruitSalesPlatform.dao.AccessoryDao;
import com.FruitSalesPlatform.entity.Accessory;
import com.FruitSalesPlatform.service.AccessoryService;
import com.FruitSalesPlatform.utils.IDUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
public class AccessoryServiceImpl implements AccessoryService {

    private final AccessoryDao accessoryDao;

    @Override
    public List<Accessory> selectByFruitId(String fruitid) {
        return accessoryDao.selectByFruitId(fruitid);
    }

    @Override
    public void deleteBatch(List<String> ids) {
        if (ids.size()>0){
            accessoryDao.deleteBatch(ids);
        }
    }

    @Override
    public void deleteByFruitId(String fruitid) {
        accessoryDao.deleteByFruitId(fruitid);
    }

    @Override
    public void insertOne(Accessory accessory) {
        accessory.setAccessoryid(IDUtil.getId());
        accessory.setCreatetime(LocalDateTime.now());
        accessoryDao.insertOne(accessory);
    }

}
