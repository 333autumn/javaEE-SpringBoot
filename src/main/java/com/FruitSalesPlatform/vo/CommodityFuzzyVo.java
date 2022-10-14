package com.FruitSalesPlatform.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommodityFuzzyVo {
    private String name;
    private double minPrice;
    private double maxPrice;
    private String locality;//产地
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    //分页属性
    private Long pageNum;
    private Long pageSize;
}
