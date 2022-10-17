package com.FruitSalesPlatform.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 保存合同时的货物信息封装
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MiddleFruitVo {
    private String fruitid;
    private double number;
}
