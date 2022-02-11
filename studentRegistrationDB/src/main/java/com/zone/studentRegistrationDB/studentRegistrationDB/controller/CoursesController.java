package com.zone.studentRegistrationDB.studentRegistrationDB.controller;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.Courses;
import com.zone.studentRegistrationDB.studentRegistrationDB.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/Courses")
@CrossOrigin
public class CoursesController {

    @Autowired
    private CoursesService coursesService;

    //post method
    @RequestMapping("/save")
    public Courses save(@RequestBody Courses courses){
        Courses course = coursesService.serveCourses(courses.getCourseCode(),courses.getCourseName(),courses.getCreditHrs(),courses.getDescription());
        return course;
    }


    //get methods
    @RequestMapping("/getCourses")
    public Courses getCourses(@RequestBody Courses courses){
        return coursesService.getByCoursesCode(courses.getCourseCode());
    }


    @RequestMapping("/getAllCourses")
    public List<Courses> getAllCourses(){
        return coursesService.getAllCourses();
    }


    //put method
    @RequestMapping("/updateCourses")
    public  Courses updateCourses(@RequestBody Courses courses){
        return coursesService.updateCourse(courses.getCourseCode(),courses.getCourseName(),courses.getCreditHrs(),courses.getDescription());
    }


    //delete methods
    @RequestMapping("/deleteByCoursesCode")
    public Courses deleteByCoursesCode(@RequestBody Courses courses){
        return coursesService.deleteByCoursesCode(courses.getCourseCode());
    }


    @RequestMapping("/deleteAllCourses")
    public String deleteAllCourses(){
        return coursesService.deleteAll();
    }

}