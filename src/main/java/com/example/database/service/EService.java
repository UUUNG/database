package com.example.database.service;

import com.example.database.domain.DResult;
import com.example.database.domain.EResult;
import com.example.database.repository.DRepository;
import com.example.database.repository.ERepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EService {
    @Autowired
    private ERepository eRepository;

    public List<EResult> getResult(){
        List<Object[]> result = eRepository.findResult();
        log.info("result in e: {}", result);
        List<EResult> eResults = new ArrayList<>();
        for (Object[] row : result) {
            eResults.add(EResult.builder()
                    .sno((String) row[0])
                    .sname((String) row[1])
                    .total_credits((BigDecimal) row[2])
                    .average_exam_score((BigDecimal) row[3])
                    .build());
        }
        return eResults;
    }


}
