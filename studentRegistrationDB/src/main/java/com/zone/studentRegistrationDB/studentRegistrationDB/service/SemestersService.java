package com.zone.studentRegistrationDB.studentRegistrationDB.service;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.Semesters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zone.studentRegistrationDB.studentRegistrationDB.repository.SemestersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SemestersService {

    @Autowired
    private SemestersRepository semestersRepository;



    //Save methods
    public Semesters saveSemesters(int semesterId ,int semesterSeason,int semesterYear){
       return semestersRepository.save(new Semesters(semesterId,semesterSeason,semesterYear));

    }




    //Get methods
    public List<Semesters> getAllSemesters(){
        return semestersRepository.findAll();
    }


    public Semesters getBySemesterId(int semesterId){
        return semestersRepository.findBySemesterId(semesterId);

    }




    //Delete methods
    public Semesters deleteBySemesterId(int semesterId){
      Semesters semesters=  semestersRepository.findBySemesterId(semesterId);
      semestersRepository.delete(semesters);
      return semesters;
    }



    public String deleteAll(){
        semestersRepository.deleteAll();
        return "Deleted all records";
    }


}
