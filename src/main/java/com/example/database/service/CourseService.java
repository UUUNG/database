package com.example.database.service;

import com.example.database.domain.CourseEntity;
import com.example.database.domain.StudentEntity;
import com.example.database.repository.CourseRepository;
import com.example.database.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<CourseEntity> findAll() {
        List<CourseEntity> students = courseRepository.findAll();
        log.info("Students: {}", students);
        return courseRepository.findAll();
    }
    public int getTotalCount(){
        int num = courseRepository.getTotalCount();
        return num;
    }
}
