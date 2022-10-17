package com.FruitSalesPlatform.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 保存合同信息对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveContractVo {
    private String retailerid;
    private Integer type;
    //货物信息
    List<MiddleFruitVo> fruits;
}
