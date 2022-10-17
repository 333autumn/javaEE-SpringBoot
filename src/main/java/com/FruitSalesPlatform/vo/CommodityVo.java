package com.FruitSalesPlatform.vo;

import com.FruitSalesPlatform.entity.Accessory;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommodityVo {

    private String fruitid;
    private String name;
    private double price;
    private String locality;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime createtime;
    //货物数量
    private double number;
    //附属品列表
    private List<Accessory> accessories;

}
