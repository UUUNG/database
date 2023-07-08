package com.example.database.service;

import com.example.database.domain.StudentEntity;
import com.example.database.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> findAll() {
        List<StudentEntity> students = studentRepository.findAll();
        log.info("Students: {}", students);
        return studentRepository.findAll();
    }

    public int getTotalCount(){
        int num = studentRepository.getTotalCount();
        return num;
    }
//    public StudentEntity save(StudentEntity studentEntity) {
//        studentRepository.saveOne(
//                studentEntity.getSno(),
//                studentEntity.getPno(),
//                studentEntity.getSname(),
//                studentEntity.getYear(),
//                studentEntity.getDept()
//        );
//        return studentEntity;
//    }
}
