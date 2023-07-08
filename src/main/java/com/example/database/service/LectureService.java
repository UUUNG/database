package com.example.database.service;

import com.example.database.domain.LectureEntity;
import com.example.database.domain.ProfessorEntity;
import com.example.database.repository.LectureRepository;
import com.example.database.repository.ProfessoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LectureService {
    @Autowired
    private LectureRepository lectureRepository;

    public List<LectureEntity> findAll() {
        return lectureRepository.findAll();
    }

    public int getTotalCount(){
        int num = lectureRepository.getTotalCount();
        return num;
    }
}
