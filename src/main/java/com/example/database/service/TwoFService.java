package com.example.database.service;

import com.example.database.domain.TwoEResult;
import com.example.database.domain.TwoFResult;
import com.example.database.repository.TwoERepository;
import com.example.database.repository.TwoFRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TwoFService {
    @Autowired
    private TwoFRepository twoFRepository;

    public List<TwoFResult> findAll() {
        List<TwoFResult> result = twoFRepository.findAll();
        log.info("result in two F: {}", result);
        return twoFRepository.findAll();
    }


}
