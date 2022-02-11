package com.zone.studentRegistrationDB.studentRegistrationDB.controller;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.Doctors;
import com.zone.studentRegistrationDB.studentRegistrationDB.service.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/Doctors")
@CrossOrigin
public class DoctorController {

    @Autowired
    private DoctorsService doctorsService;


    //post method
    @RequestMapping("/save")
    public Doctors saveDoctors(@RequestBody Doctors doctors){
        return  doctorsService.saveDoctors(doctors.getDoctorNo(),doctors.getDoctorName(),doctors.getQualifications());
    }


    //get methods
    @RequestMapping("/getDoctor")
    public Doctors getDoctors(@RequestBody Doctors doctors){
        return doctorsService.getByDoctorNo(doctors.getDoctorNo());
    }


    @RequestMapping("/getAllDoctors")
    public List<Doctors> getAllDoctors(){
        return doctorsService.getAllDoctors();
    }


    //put method
    @RequestMapping("/updateDoctors")
    public Doctors updateDoctors(@RequestBody Doctors doctors){
        return doctorsService.updateDoctors(doctors.getDoctorNo(),doctors.getDoctorName(),doctors.getQualifications());
    }


    //delete methods
    @RequestMapping("/deleteById")
    public Doctors deleteById(@RequestBody Doctors doctors){
        return doctorsService.deleteByDoctorNo(doctors.getDoctorNo());
    }


    @RequestMapping("/deleteAllDoctors")
    public String  deleteAllDoctors(){
        return doctorsService.deleteAll();
    }

}
