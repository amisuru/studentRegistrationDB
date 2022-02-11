package com.zone.studentRegistrationDB.studentRegistrationDB.controller;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.StudentCourses;
import com.zone.studentRegistrationDB.studentRegistrationDB.service.StudentCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/StudentCourses")
@CrossOrigin
public class StudentCoursesController {


    @Autowired
    private StudentCoursesService studentCoursesService;

    //Post method
    @RequestMapping("/save")
    public StudentCourses saveStudentCourses(@RequestBody StudentCourses studentCourses ){
        StudentCourses studentCourse= studentCoursesService.saveStudentCourses(studentCourses.getStudentCoursesId(),studentCourses.getStudentReg(),studentCourses.getCourseCode(),studentCourses.getGrade());
        return studentCourse;
    }


    //Get methods
    @RequestMapping("/getStudentCourses")
    public StudentCourses getByStudentCoursesId(@RequestBody StudentCourses studentCourses){
        return studentCoursesService.getByStudentCoursesId(studentCourses.getStudentCoursesId());
    }


    @RequestMapping("/getAllStudentCourses")
    public List<StudentCourses> getAllStudentCourses(){
        return studentCoursesService.getAllStudentCourses();
    }




    //Delete methods
    @RequestMapping("/deleteById")
    public StudentCourses deleteById(@RequestBody StudentCourses studentCourses){
        return studentCoursesService.deleteById(studentCourses.getStudentCoursesId());
    }


    @RequestMapping("/deleteAllStudentCourses")
    public String deleteAllStudentCourses(){
        return studentCoursesService.deleteAll();
    }











}
