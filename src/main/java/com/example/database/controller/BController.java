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
public class BController {
    @Autowired
    BService bService;
    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;
    @Autowired
    EnrollService enrollService;
    @Autowired
    ProfessorService professorService;
    @Autowired
    LectureService lectureService;
    @Autowired
    CService cService;
    @Autowired
    DService dService;
    @Autowired
    EService eService;
    @Autowired
    FService fService;
    @Autowired
    GService gService;
    @Autowired
    HService hService;

    @GetMapping(value = "/student") //student의 테이블과 총 개수를 가져와 jsp파일에 전달한다.
    public ModelAndView stu(){
        ModelAndView modelAndView = new ModelAndView("student");

        List<StudentEntity> students = studentService.findAll();
        int total_num = studentService.getTotalCount();
        modelAndView.addObject("students", students);
        modelAndView.addObject("total_num", total_num);
        return modelAndView;
    }

    @GetMapping(value = "/course") //course의 테이블과 총 개수를 가져와 jsp파일에 전달한다.
    public ModelAndView course(){
        ModelAndView modelAndView = new ModelAndView("course");

        List<CourseEntity> courses = courseService.findAll();
        int total_num = courseService.getTotalCount();
        modelAndView.addObject("courses", courses);
        modelAndView.addObject("total_num", total_num);

        return modelAndView;
    }

    @GetMapping(value = "/enroll") //enroll의 테이블과 총 개수를 가져와 jsp파일에 전달한다.
    public ModelAndView enroll(){
        ModelAndView modelAndView = new ModelAndView("enroll");

        List<EnrollEntity> enrolls = enrollService.findAll();
        int total_num = enrollService.getTotalCount();
        modelAndView.addObject("enrolls", enrolls);
        modelAndView.addObject("total_num", total_num);

        return modelAndView;
    }

    @GetMapping(value = "/professor") //professor의 테이블과 총 개수를 가져와 jsp파일에 전달한다.
    public ModelAndView professor(){
        ModelAndView modelAndView = new ModelAndView("professor");

        List<ProfessorEntity> professors = professorService.findAll();
        int total_num = professorService.getTotalCount();
        modelAndView.addObject("professors", professors);
        modelAndView.addObject("total_num", total_num);

        return modelAndView;
    }

    @GetMapping(value = "/lecture") //lecture의 테이블과 총 개수를 가져와 jsp파일에 전달한다.
    public ModelAndView lecture(){
        ModelAndView modelAndView = new ModelAndView("lecture");

        List<LectureEntity> lectures = lectureService.findAll();
        int total_num = lectureService.getTotalCount();
        modelAndView.addObject("lectures", lectures);
        modelAndView.addObject("total_num", total_num);

        return modelAndView;
    }

    @GetMapping(value = "/b/form") //b번 문제의 입력 값을 받아와 입력값을 /b에 전달
    public ModelAndView formB() {
        ModelAndView modelAndView = new ModelAndView("bForm");
        return modelAndView;
    }

    @PostMapping(value = "/b") //받아온 입력값을 jsp파일에 전달
    public ModelAndView requestB(
            BigDecimal sNumber
    ) {
        ModelAndView modelAndView = new ModelAndView("bResult");

        List<BResult> bResults = bService.getResult(sNumber);

        modelAndView.addObject("bResults", bResults);

        return modelAndView;
    }
    @GetMapping(value = "/c") //c번 문제에 해당하는 쿼리의 결과를 jsp파일에 전달
    public ModelAndView formC() {
        ModelAndView modelAndView = new ModelAndView("cResult");
        //cService.updateResult();
        List<CResult> cResults = cService.getResultC();
        modelAndView.addObject("cResults", cResults);
        return modelAndView;
    }
    @GetMapping(value = "/c/result") //c번 문제에 해당하는 쿼리의 결과를 jsp파일에 전달
    public ModelAndView formCResult() {
        ModelAndView modelAndView = new ModelAndView("cResult");
        cService.updateResult();
        List<CResult> cResults = cService.getResultC();
        modelAndView.addObject("cResults", cResults);
        return modelAndView;
    }
    @GetMapping(value = "/d") //d번 문제에 해당하는 쿼리의 결과를 jsp파일에 전달
    public ModelAndView formD() {
        ModelAndView modelAndView = new ModelAndView("dResult");
        List<DResult> dResults = dService.getResult();
        modelAndView.addObject("dResults", dResults);
        return modelAndView;
    }
    @GetMapping(value = "/e") //e번 문제에 해당하는 쿼리의 결과를 jsp파일에 전달
    public ModelAndView formE() {
        ModelAndView modelAndView = new ModelAndView("eResult");
        List<EResult> eResults = eService.getResult();
        modelAndView.addObject("eResults", eResults);
        return modelAndView;
    }
    @GetMapping(value = "/f") //f번 문제에 해당하는 쿼리의 결과를 jsp파일에 전달
    public ModelAndView formF() {
        ModelAndView modelAndView = new ModelAndView("fResult");
        List<FResult> fResults = fService.getResult();
        modelAndView.addObject("fResults", fResults);
        return modelAndView;
    }
    @GetMapping(value = "/g") //g번 문제에 해당하는 쿼리의 결과를 jsp파일에 전달
    public ModelAndView formG() {
        ModelAndView modelAndView = new ModelAndView("gResult");
        List<GResult> gResults = gService.getResult();
        modelAndView.addObject("gResults", gResults);
        return modelAndView;
    }
    @GetMapping(value = "/h") //h번 문제에 해당하는 쿼리의 결과를 jsp파일에 전달
    public ModelAndView formH() {
        ModelAndView modelAndView = new ModelAndView("hResult");
        List<HResult> hResults = hService.getResult();
        modelAndView.addObject("hResults", hResults);
        return modelAndView;
    }
}
