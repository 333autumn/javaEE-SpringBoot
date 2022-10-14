package com.FruitSalesPlatform.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormat {

    public static Date format(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String source = simpleDateFormat.format(date);
        Date result = null;
        try{
            result=simpleDateFormat.parse(source);
        }catch (Exception e){
            return null;
        }
        return result;
    }

}
