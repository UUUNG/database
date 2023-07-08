package com.example.database.service;

import com.example.database.domain.GResult;
import com.example.database.domain.HResult;
import com.example.database.repository.GRepository;
import com.example.database.repository.HRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class HService {
    @Autowired
    private HRepository hRepository;

    public List<HResult> getResult(){
        List<Object[]> result = hRepository.findResult();
        log.info("result in h: {}", result);
        List<HResult> hResults = new ArrayList<>();
        for (Object[] row : result) {
            hResults.add(HResult.builder()
                    .dept((String) row[0])
                    .year((String) row[1])
                    .total_num((BigDecimal) row[2])
                    .build());
        }
        return hResults;
    }


}
