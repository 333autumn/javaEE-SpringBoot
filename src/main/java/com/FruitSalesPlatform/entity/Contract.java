package com.FruitSalesPlatform.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 合同
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    private String contractid;
    private String retailerid;
    private String barcode;
    private Integer type;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime createtime;
}
