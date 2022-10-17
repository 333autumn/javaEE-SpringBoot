package com.FruitSalesPlatform.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * 模糊查询合同对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractFuzzyVo {
    private String barcode;
    private String name;
    private Integer type;
    private LocalDate startTime;
    private LocalDate endTime;
    //分页属性
    private Long pageNum;
    private Long pageSize;
}
