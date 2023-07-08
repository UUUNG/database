package com.example.database.service;

import com.example.database.domain.FResult;
import com.example.database.domain.GResult;
import com.example.database.repository.FRepository;
import com.example.database.repository.GRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class GService {
    @Autowired
    private GRepository gRepository;

    public List<GResult> getResult(){
        List<Object[]> result = gRepository.findResult();
        log.info("result in g: {}", result);
        List<GResult> gResults = new ArrayList<>();
        for (Object[] row : result) {
            gResults.add(GResult.builder()
                    .pdept((String) row[0])
                    .lect_num((BigDecimal) row[1])
                    .build());
        }
        return gResults;
    }


}
