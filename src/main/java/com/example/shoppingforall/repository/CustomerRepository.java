package com.example.shoppingforall.repository;

import com.example.shoppingforall.entity.CustomerEntity;

public interface CustomerRepository{
    CustomerEntity getCustomerById(String id);
}