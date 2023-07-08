package com.example.database.service;

import com.example.database.domain.PublisherEntity;
import com.example.database.domain.TwoBResult;
import com.example.database.repository.PublisherRepository;
import com.example.database.repository.TwoBRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public List<PublisherEntity> findAll() {
        List<PublisherEntity> result = publisherRepository.findAll();
                log.info("result={}", result);
        return publisherRepository.findAll();
    }

}
