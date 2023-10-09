package com.example.shoppingforall.service.impl;

import com.example.shoppingforall.repository.CustomerRepository;
import com.example.shoppingforall.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

//    @Override
//    public Customer getCustomerByid(String id) {
//        LOGGER.info("===Get customer by id :{}====", id);
//        Customer customer = customerRepository.getCustomerById(id);
//        if (Objects.isNull(customer)) {
//            throw new Exception(
//                    ExceptionUtils.C_NOT_FOUND_CUSTOMER,
//                    ExceptionUtils.messages.get(ExceptionUtils.C_NOT_FOUND_CUSTOMER));
//        }
//
//        return null;
//    }
}
