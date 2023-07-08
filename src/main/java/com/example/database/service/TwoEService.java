package com.example.database.service;

import com.example.database.domain.TwoBResult;
import com.example.database.domain.TwoCResult;
import com.example.database.domain.TwoEResult;
import com.example.database.repository.TwoCRepository;
import com.example.database.repository.TwoERepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TwoEService {
    @Autowired
    private TwoERepository twoERepository;

    public List<TwoEResult> findAll() {
        List<TwoEResult> result = twoERepository.findAll();
        log.info("result: {}", result);
        return twoERepository.findAll();
    }


}
