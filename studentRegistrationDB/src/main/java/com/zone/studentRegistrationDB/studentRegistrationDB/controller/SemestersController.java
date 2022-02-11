package com.zone.studentRegistrationDB.studentRegistrationDB.controller;


import com.zone.studentRegistrationDB.studentRegistrationDB.document.Semesters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zone.studentRegistrationDB.studentRegistrationDB.service.SemestersService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="api/v1/Semesters")
@CrossOrigin
public class SemestersController {
    @Autowired
    private SemestersService semestersService;

    //post method
    @RequestMapping("/save")
    public Semesters saveSemesters(@RequestBody Semesters semesters ){
        Semesters semester= semestersService.saveSemesters(semesters.getSemesterId(),semesters.getSemesterSeason(),semesters.getSemesterYear());
        return semester;
    }


    //get methods
    @RequestMapping("/getSemesters")
    public Semesters getSemesters(@RequestBody Semesters semesters){
        return semestersService.getBySemesterId(semesters.getSemesterId());
    }


    @RequestMapping("/getAllSemesters")
    public List<Semesters> getAllSemesters(){
        return semestersService.getAllSemesters();
    }




    //delete methods
    @RequestMapping("/deleteById")
    public Semesters deleteById(@RequestBody Semesters semesters){
        return semestersService.deleteBySemesterId(semesters.getSemesterId());
    }


    @RequestMapping("/deleteAllSemesters")
    public String deleteAllDoctors(){
        return semestersService.deleteAll();
    }


}
