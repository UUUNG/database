package com.example.database.service;

import com.example.database.domain.ProfessorEntity;
import com.example.database.domain.TwoAResult;
import com.example.database.domain.TwoBResult;
import com.example.database.repository.TwoARepository;
import com.example.database.repository.TwoBRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TwoBService {
    @Autowired
    private TwoBRepository twoBRepository;

    public List<TwoBResult> findAll() {
        List<TwoBResult> result = twoBRepository.findAll();
        log.info("result: {}", result);
        return twoBRepository.findAll();
    }

    public List<TwoBResult> getResult(String name){
        log.info("name: {}", name);
        List<Object[]> result = twoBRepository.findPublisherByName(name);
        log.info("result: {}", result);
        List<TwoBResult> twoBResults = new ArrayList<>();
        for (Object[] row : result) {
            twoBResults.add(TwoBResult.builder()
                    .title((String) row[0])
                    .price((BigDecimal) row[1])
                    .num((String) row[2])
                    .build());
        }
        return twoBResults;
    }


}
