package com.FruitSalesPlatform.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page<T> {

    private Long total;//总数据条数

    private List<T> rows;//当前页的返回数据

}
