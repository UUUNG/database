package com.example.database.service;

import com.example.database.domain.EnrollEntity;
import com.example.database.domain.StudentEntity;
import com.example.database.repository.EnrollRepository;
import com.example.database.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EnrollService {
    @Autowired
    private EnrollRepository enrollRepository;

    public List<EnrollEntity> findAll() {
        return enrollRepository.findAll();
    }

    public int getTotalCount(){
        int num = enrollRepository.getTotalCount();
        return num;
    }
}
