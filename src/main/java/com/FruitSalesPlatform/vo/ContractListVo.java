package com.FruitSalesPlatform.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 合同列表返回对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractListVo {
    private String contractid;
    private String barcode;
    private Integer type;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime createtime;
    //营销商姓名
    private String name;
}
