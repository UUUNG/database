package com.example.database.service;

import com.example.database.domain.BResult;
import com.example.database.domain.DResult;
import com.example.database.repository.BRepository;
import com.example.database.repository.DRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class DService {
    @Autowired
    private DRepository dRepository;

    public List<DResult> getResult(){
        List<Object[]> result = dRepository.findResult();
        log.info("result in d: {}", result);
        List<DResult> dResults = new ArrayList<>();
        for (Object[] row : result) {
            dResults.add(DResult.builder()
                    .cname((String) row[0])
                    .max_score((BigDecimal) row[1])
                    .min_score((BigDecimal) row[2])
                    .sno((String) row[3])
                    .sname((String) row[4])
                    .build());
        }
        return dResults;
    }


}
