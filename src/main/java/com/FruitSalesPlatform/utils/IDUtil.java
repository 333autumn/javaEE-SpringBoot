package com.FruitSalesPlatform.utils;

import java.util.UUID;

public class IDUtil {

    /**
     * 生成数据库主键
     */
    public static String getId(){
        return UUID.randomUUID().toString();
    }

}
