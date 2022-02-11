package com.zone.studentRegistrationDB.studentRegistrationDB.controller;


import com.zone.studentRegistrationDB.studentRegistrationDB.document.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zone.studentRegistrationDB.studentRegistrationDB.service.StudentsService;

import java.util.List;


@RestController
@RequestMapping(value="api/v1/Students")
@CrossOrigin
public class StudentsController {
    @Autowired
    private StudentsService studentsService;



    //post method
    @PostMapping("/save")
    public Students saveStudents(@RequestBody Students students){
       Students student= studentsService.saveStudents(students.getStudentReg() ,students.getAddress(),students.getDateOfBirth(),students.getMobileNo(),students.getNationality(),students.getPhone(),students.getStudentName());
        return student;
    }


   //get methods
    @RequestMapping("/getStudent")
    public Students getStudents(@RequestBody Students students){
         return studentsService.getByStudentReg(students.getStudentReg());
    }


    @RequestMapping("/getAllStudents")
    public List<Students> getAllStudents(){
        return studentsService.getAllStudents();
    }


     //put method
     @RequestMapping("/updateStudent")
       public  Students updateStudent(@RequestBody Students students){
        return studentsService.updateStudent(students.getStudentReg(),students.getAddress(),students.getAddress(),students.getMobileNo(),students.getNationality(),students.getPhone(),students.getStudentName());
     }


    //delete methods
    @RequestMapping("/deleteById")
    public Students deleteById(@RequestBody Students students){
        return studentsService.deleteById(students.getStudentReg());
    }


     @RequestMapping("/deleteAllStudents")
    public String deleteAllStudents(){
        return studentsService.deleteAll();
     }






    }



