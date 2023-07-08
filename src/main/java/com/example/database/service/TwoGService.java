package com.example.database.service;

import com.example.database.domain.TwoFResult;
import com.example.database.domain.TwoGResult;
import com.example.database.repository.TwoFRepository;
import com.example.database.repository.TwoGRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TwoGService {
    @Autowired
    private TwoGRepository twoGRepository;

    public List<TwoGResult> findBookByNum(String num) {
        List<TwoGResult> result = twoGRepository.findBookByNum(num);
        log.info("result in two G: {}", result);
        return result;
    }
}
