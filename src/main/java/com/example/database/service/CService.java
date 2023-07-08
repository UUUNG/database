package com.example.database.service;

import com.example.database.domain.CResult;
import com.example.database.domain.EResult;
import com.example.database.repository.CRepository;
import com.example.database.repository.ERepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CService {
    @Autowired
    private CRepository cRepository;

    public List<CResult> getResultC(){
        List<Object[]> result = cRepository.findResult();
        log.info("result in c: {}", result);
        List<CResult> cResults = new ArrayList<>();
        for (Object[] row : result) {
            cResults.add(CResult.builder()
                    .sname((String) row[0])
                    .sno((String) row[1])
                    .cno((String) row[2])
                    .build());
        }
        return cResults;
    }
    public void updateResult(){
        cRepository.updateResult();
    }


}
