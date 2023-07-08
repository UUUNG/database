package com.example.database.service;

import com.example.database.domain.EResult;
import com.example.database.domain.FResult;
import com.example.database.repository.ERepository;
import com.example.database.repository.FRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class FService {
    @Autowired
    private FRepository fRepository;

    public List<FResult> getResult(){
        List<Object[]> result = fRepository.findResult();
        log.info("result in f: {}", result);
        List<FResult> fResults = new ArrayList<>();
        for (Object[] row : result) {
            fResults.add(FResult.builder()
                    .cname((String) row[0])
                    .average_exam_score((String) row[1])
                    .grade_a((BigDecimal) row[2])
                    .grade_b((BigDecimal) row[3])
                    .grade_c((BigDecimal) row[4])
                    .grade_d((BigDecimal) row[5])
                    .grade_f((BigDecimal) row[6])
                    .build());
        }
        return fResults;
    }


}
