package com.FruitSalesPlatform.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userid;
    private String username;
    private String password;
    private String name;
    private String telphone;
}
