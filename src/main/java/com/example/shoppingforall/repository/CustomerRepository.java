package com.example.shoppingforall.repository;

import com.example.shoppingforall.domain.Customer;

public interface CustomerRepository{
    Customer getCustomerById(String id);
}