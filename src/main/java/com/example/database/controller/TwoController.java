package com.example.database.controller;

import com.example.database.domain.*;
import com.example.database.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@RestController
public class TwoController {
    @Autowired
    TwoAService twoAService;
    @Autowired
    TwoBService twoBService;
    @Autowired
    PublisherService publisherService;
    @Autowired
    TwoCService twoCService;
    @Autowired
    CustomerService customerService;
    @Autowired
    TwoEService twoEService;
    @Autowired
    TwoFService twoFService;
    @Autowired
    TwoGService twoGService;



    @GetMapping(value = "/a2/form") //입력값을 받아 입력값을 a2에 전달한다.
    public ModelAndView formA() {
        ModelAndView modelAndView = new ModelAndView("twoAForm");
        return modelAndView;
    }

    @PostMapping(value = "/a2") // 받아온 입력값을 jsp파일에 전달한다.
    public ModelAndView requestA(
            String name,
            String address
    ) {
        ModelAndView modelAndView = new ModelAndView("twoAResult");

        List<TwoAResult> twoAResults = twoAService.getResult(name, address);

       log.info("twoAResults in controller: {}", twoAResults);
        modelAndView.addObject("twoAResults", twoAResults);

        return modelAndView;
    }

    @GetMapping(value = "/b2/form") //입력값을 받아 입력값을 b2에 전달한다.
    public ModelAndView formB() {
        ModelAndView modelAndView = new ModelAndView("twoBForm");

        List<PublisherEntity> publishers = publisherService.findAll();
        modelAndView.addObject("publishers", publishers);
        return modelAndView;
    }
    @PostMapping(value = "/b2") // 받아온 입력값을 jsp파일에 전달한다.
    public ModelAndView requestB(
            String name
    ) {
        ModelAndView modelAndView = new ModelAndView("twoBResult");

        List<TwoBResult> twoBResults = twoBService.getResult(name);

        modelAndView.addObject("twoBResults", twoBResults);

        return modelAndView;
    }
    @GetMapping(value = "/c2/form") //입력값을 받아 입력값을 c2에 전달한다.
    public ModelAndView formC() {
        ModelAndView modelAndView = new ModelAndView("twoCForm");

        List<CustomerEntity> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @PostMapping(value = "/c2") // 받아온 입력값을 jsp파일에 전달한다.
    public ModelAndView requestC(
            String email
    ) {
        ModelAndView modelAndView = new ModelAndView("twoCResult");
        log.info("email={}", email);
        List<TwoCResult> twoCResults = twoCService.getResult(email);

        modelAndView.addObject("twoCResults", twoCResults);

        return modelAndView;
    }

    @GetMapping(value = "/e2")
    public ModelAndView formE() {
        ModelAndView modelAndView = new ModelAndView("twoEForm");

        List<TwoEResult> results = twoEService.findAll();
        modelAndView.addObject("results", results);
        return modelAndView;
    }
    @GetMapping(value = "/f2")
    public ModelAndView formF() {
        ModelAndView modelAndView = new ModelAndView("twoFForm");

        List<TwoFResult> results = twoFService.findAll();
        modelAndView.addObject("results", results);
        return modelAndView;
    }
    @GetMapping(value = "/g2/form")
    public ModelAndView formG() {
        ModelAndView modelAndView = new ModelAndView("twoGForm");
        return modelAndView;
    }
    @PostMapping(value = "/g2")
    public ModelAndView requestG(
            String num
    ) {
        ModelAndView modelAndView = new ModelAndView("twoGResult");

        List<TwoGResult> results = twoGService.findBookByNum(num);
        modelAndView.addObject("results", results);
        return modelAndView;
    }

}
