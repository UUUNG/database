package com.example.database.service;

import com.example.database.domain.CustomerEntity;
import com.example.database.domain.PublisherEntity;
import com.example.database.repository.CustomerRepository;
import com.example.database.repository.PublisherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerEntity> findAll() {
        List<CustomerEntity> result = customerRepository.findAll();
        log.info("result in customer={}", result);
        return customerRepository.findAll();
    }

}
