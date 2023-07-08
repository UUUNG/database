package com.example.database.service;

import com.example.database.domain.TwoAResult;
import com.example.database.repository.TwoARepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TwoAService {
    @Autowired
    private TwoARepository twoARepository;

    public List<TwoAResult> getResult(String name, String address){
        log.info("name: {}, address: {}", name, address);
        List<Object[]> result = twoARepository.findResult(name, address);
        log.info("result: {}", result);
        List<TwoAResult> twoAResults = new ArrayList<>();
        for (Object[] row : result) {
            twoAResults.add(TwoAResult.builder()
                    .title((String) row[0])
                    .num((BigDecimal) row[1])
                    .build());
        }
        return twoAResults;
    }


}
