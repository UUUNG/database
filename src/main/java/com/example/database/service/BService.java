package com.example.database.service;

import com.example.database.domain.BResult;
import com.example.database.domain.EnrollEntity;
import com.example.database.domain.StudentEntity;
import com.example.database.repository.BRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BService {
    @Autowired
    private BRepository bRepository;

//    public List<StudentEntity> findAll() {
//        List<StudentEntity> results = bRepository.findAll();
//        log.info("result: {}", results);
//        return results;
//    }

//    public List<EnrollEntity> findOther(){
//        List<EnrollEntity> results = bRepository.findOther();
//        log.info("result enroll: {}", results);
//        return results;
//    }
    public List<BResult> getResult(BigDecimal sno){
        log.info("sno: {}", sno);
        List<Object[]> result = bRepository.findCourseGradeAndExamById(sno);
        log.info("result: {}", result);
        List<BResult> bResults = new ArrayList<>();
        for (Object[] row : result) {
            bResults.add(BResult.builder()
                    .cname((String) row[0])
                    .grade((String) row[1])
                    .exam((BigDecimal) row[2])
                    .build());
        }
        return bResults;
    }


}
