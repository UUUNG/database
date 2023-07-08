package com.example.database.controller;

import com.example.database.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class DatabaseController {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/home")
    public String home(){
        return "hello world";
    }
    @GetMapping(value = "/test")
    public ModelAndView ViewTest(){
        ModelAndView modelAndView = new ModelAndView("test");

        modelAndView.addObject("name", "world");
        return modelAndView;
    }

    @GetMapping(value = "/student/form")
    public ModelAndView FormStudent() {
        ModelAndView modelAndView = new ModelAndView("insertTestForm");
        return modelAndView;
    }
//
//    public ModelAndView InsertStudent( @GetMapping(value = "/student")
////    public ModelAndView stu(){
////        ModelAndView modelAndView = new ModelAndView("selectTest");
////
////        List<StudentEntity> students = studentService.findAll();
////
////        modelAndView.addObject("students", students);
////
////        return modelAndView;
////    }
//            StudentEntity studentEntity
//    ) {
//        ModelAndView modelAndView = new ModelAndView("insertTest");
//
//        StudentEntity savedStudentEntity = studentService.save(studentEntity);
//
//        modelAndView.addObject("student", savedStudentEntity);
//
//        return modelAndView;
//    }
}
