package com.zone.studentRegistrationDB.studentRegistrationDB.service;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.Doctors;
import com.zone.studentRegistrationDB.studentRegistrationDB.repository.DoctorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorsService {

    @Autowired
    private DoctorsRepository doctorsRepository;

    //Save methods
    public Doctors saveDoctors(int doctorNo, String doctorName, String  Qualifications){
        return doctorsRepository.save(new Doctors(doctorNo,doctorName,Qualifications));
    }




    //Get methods
    public List<Doctors> getAllDoctors(){
        return doctorsRepository.findAll();
    }


    public Doctors getByDoctorNo(int doctorNo){
        return doctorsRepository.findByDoctorNo(doctorNo);

    }

    //Update method
    public Doctors updateDoctors(int doctorNo,String doctorName,String  qualifications){
        Doctors doctors = doctorsRepository.findByDoctorNo(doctorNo);

        doctors.setQualifications(qualifications);
        doctors.setDoctorName(doctorName);


        return doctorsRepository.save(doctors);

    }


    //Delete methods
    public Doctors deleteByDoctorNo(int doctorNo){
        Doctors doctors=doctorsRepository.findByDoctorNo(doctorNo);
        doctorsRepository.delete(doctors);
        return doctors;
    }


    public String deleteAll(){

        doctorsRepository.deleteAll();
        return "Deleted all records";
    }





}
