package com.zone.studentRegistrationDB.studentRegistrationDB.controller;



import com.zone.studentRegistrationDB.studentRegistrationDB.document.SemesterCourses;
import com.zone.studentRegistrationDB.studentRegistrationDB.service.SemesterCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/SemesterCourses")
@CrossOrigin
public class SemesterCoursesController {
    @Autowired
    private SemesterCoursesService semesterCoursesService;

    //post method
    @RequestMapping("/save")
    public SemesterCourses saveSemesterCourses(@RequestBody SemesterCourses semesterCourses){
         semesterCoursesService.saveSemesterCourses(semesterCourses.getSemesterCoursesId(),semesterCourses.getDoctorNo(),semesterCourses.getSemesterId(),semesterCourses.getCourseCode());
        return semesterCourses;
    }


    //get methods
    @RequestMapping("/getSemesterCourses")
    public SemesterCourses getSemesterCourses(@RequestBody SemesterCourses semesterCourses){
        return semesterCoursesService.getByCoursesId(semesterCourses.getSemesterCoursesId());
    }


    @RequestMapping("/getAllSemesterCourses")
    public List<SemesterCourses> getAllSemesterCourses(){
        return semesterCoursesService.getAllSemesterCourses();
    }


    //put method
    @RequestMapping("/updateSemesterCourses")
    public  SemesterCourses updateSemesterCourses(@RequestBody SemesterCourses semesterCourses){
        return semesterCoursesService.updateSemesterCourses(semesterCourses.getSemesterCoursesId(),semesterCourses.getDoctorNo(),semesterCourses.getSemesterId(),semesterCourses.getCourseCode());
    }


    //delete methods
    @RequestMapping("/deleteById")
    public SemesterCourses deleteById(int coursesId){
        return semesterCoursesService.getByCoursesId(coursesId);
    }


    @RequestMapping("/deleteAllSemesterCourses")
    public String deleteAllSemesterCourses(){
        return semesterCoursesService.deleteAll();
    }


}


