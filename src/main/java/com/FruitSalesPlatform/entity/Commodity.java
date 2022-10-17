package com.FruitSalesPlatform.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 货物
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Commodity {

    private String fruitid;
    private String name;
    private double price;
    private String locality;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime createtime;

}
