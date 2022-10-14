package com.FruitSalesPlatform.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RetailerFuzzyVo {
    private String name;
    private String telphone;
    private String address;
    private Integer status;
    private LocalDate createtime;
    //分页属性
    private Long pageNum;
    private Long pageSize;
}
