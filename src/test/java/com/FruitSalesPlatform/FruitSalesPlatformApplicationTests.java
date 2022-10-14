package com.FruitSalesPlatform;

import com.FruitSalesPlatform.dao.CommodityDao;
import com.FruitSalesPlatform.dao.RetailerDao;
import com.FruitSalesPlatform.entity.Retailer;
import com.FruitSalesPlatform.service.impl.RetailerServiceImpl;
import com.FruitSalesPlatform.utils.MyDateFormat;
import com.FruitSalesPlatform.utils.Page;
import com.FruitSalesPlatform.vo.CommodityFuzzyVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootTest
class FruitSalesPlatformApplicationTests {

    @Autowired
    private RetailerDao retailerDao;
    @Autowired
    private RetailerServiceImpl retailerService;

    @Test
    void contextLoads() {
//        List<Retailer> retailers = retailerDao.findPages(2L, 3L);
//        System.out.println(retailerDao.count());
//        Page<Retailer> pages = retailerService.findPages(1L, 3L);
//        Retailer retailer=new Retailer();
//        retailer.setCreatetime(new Date());
//        System.out.println(retailer.getCreatetime());
        Date date=new Date();
        System.out.println(MyDateFormat.format(date));
    }

    @Autowired
    private CommodityDao commodityDao;
    @Test
    void testCommodityDao(){
//        commodityDao.findPages(1L,3L);
//        commodityDao.count();
        CommodityFuzzyVo vo=new CommodityFuzzyVo();
//        vo.setMinPrice(1.0);
//        vo.setMaxPrice(2.0);
        vo.setName("黄");
//        commodityDao.countByKey(vo);
//        commodityDao.findListByKey(vo);
    }

}
