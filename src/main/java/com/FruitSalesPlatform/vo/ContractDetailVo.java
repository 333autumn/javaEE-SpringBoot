package com.FruitSalesPlatform.vo;

import com.FruitSalesPlatform.entity.Retailer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 合同详情对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractDetailVo {
    private String contractid;
    private String barcode;
    private Integer type;
    private LocalDateTime createtime;
    //关联的营销商信息
    private Retailer retailer;
    //货物信息
    private List<CommodityVo> fruits;
}
