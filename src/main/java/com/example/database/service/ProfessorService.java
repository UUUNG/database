package com.example.database.service;

import com.example.database.domain.EnrollEntity;
import com.example.database.domain.ProfessorEntity;
import com.example.database.repository.EnrollRepository;
import com.example.database.repository.ProfessoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProfessorService {
    @Autowired
    private ProfessoRepository professoRepository;

    public List<ProfessorEntity> findAll() {
        return professoRepository.findAll();
    }

    public int getTotalCount(){
        int num = professoRepository.getTotalCount();
        return num;
    }
}
