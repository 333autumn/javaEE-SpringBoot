package com.FruitSalesPlatform.utils;

import java.util.UUID;

public class IDUtil {

    public static String getId(){
        return UUID.randomUUID().toString();
    }

}
