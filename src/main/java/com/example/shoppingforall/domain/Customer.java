package com.example.shoppingforall.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String id;
    private String fullName;
    private String address1;
    private String address2;
    private String gender;
    private Date birthDay;
    private String phoneNumber;
    private String email;
    private String image;
    private String icNumber;
    private String ratings;
    private String accountBank;

}
