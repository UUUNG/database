package com.example.database.service;

import com.example.database.domain.TwoBResult;
import com.example.database.domain.TwoCResult;
import com.example.database.repository.TwoBRepository;
import com.example.database.repository.TwoCRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TwoCService {
    @Autowired
    private TwoCRepository twoCRepository;

    public List<TwoCResult> getResult(String email){
        log.info("email: {}", email);
        List<Object[]> result = twoCRepository.findCustomerByEmail(email);
        log.info("result: {}", result);
        List<TwoCResult> twoCResults = new ArrayList<>();
        for (Object[] row : result) {
            twoCResults.add(TwoCResult.builder()
                    .customer_name((String) row[0])
                    .title((String) row[1])
                    .publisher_name((String) row[2])
                    .author_name((String) row[3])
                    .address((String) row[4])
                    .url((String) row[5])
                    .build());
        }
        return twoCResults;
    }


}
