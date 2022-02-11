package com.zone.studentRegistrationDB.studentRegistrationDB.service;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.SemesterCourses;
import org.springframework.beans.factory.annotation.Autowired;
import com.zone.studentRegistrationDB.studentRegistrationDB.repository.SemesterCoursesRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SemesterCoursesService {
    @Autowired
    private SemesterCoursesRepository semesterCoursesRepository;


    //Save methods
    public SemesterCourses saveSemesterCourses(int semesterCoursesId,int doctorNo,int  semesterId,int courseCode){
        return semesterCoursesRepository.save(new SemesterCourses( semesterCoursesId,doctorNo,semesterId,courseCode));
    }




    //Get methods
    public List<SemesterCourses> getAllSemesterCourses(){
        return semesterCoursesRepository.findAll();
    }


    public SemesterCourses getByCoursesId(int coursesId){
        return semesterCoursesRepository.findBySemesterCoursesId(coursesId);

    }

    //Update method
    public SemesterCourses updateSemesterCourses(int SemesterCoursesId,int doctorNo,int  semesterId,int courseCode){
        SemesterCourses semesterCourses = semesterCoursesRepository.findBySemesterCoursesId(SemesterCoursesId);
        semesterCourses.setDoctorNo(doctorNo);
        semesterCourses.setCourseCode(courseCode);
        semesterCourses.setSemesterId(semesterId);
        return semesterCoursesRepository.save(semesterCourses);

    }


    //Delete methods
    public SemesterCourses deleteBySemesterCoursesId(int SemesterCoursesId){
       SemesterCourses semesterCourses= semesterCoursesRepository.findBySemesterCoursesId(SemesterCoursesId);
       semesterCoursesRepository.delete(semesterCourses);
        return semesterCourses;
    }


    public String deleteAll(){
        semesterCoursesRepository.deleteAll();
        return "Deleted all records";
    }
}
