package com.zone.studentRegistrationDB.studentRegistrationDB.service;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.StudentCourses;
import com.zone.studentRegistrationDB.studentRegistrationDB.repository.StudentCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCoursesService {
    @Autowired
    private StudentCoursesRepository studentCoursesRepository;


    //Save methods
    public StudentCourses saveStudentCourses(int studentCoursesId,int studentReg, int courseCode, String grade){
        return studentCoursesRepository.save(new StudentCourses(studentCoursesId,studentReg,courseCode,grade));
    }


    //Get methods
    public List<StudentCourses> getAllStudentCourses(){
        return studentCoursesRepository.findAll();
    }


    public StudentCourses getByStudentCoursesId(int studentCoursesId){
        return studentCoursesRepository.findByStudentCoursesId(studentCoursesId);

    }



    public List<StudentCourses> getByStudentReg(int studentReg){
        return studentCoursesRepository.findByStudentReg(studentReg);

    }

    //Update method
    public StudentCourses updateStudentCourses(int studentCoursesId,int studentReg, int courseCode, String grade){
        StudentCourses studentCourses = studentCoursesRepository.findByStudentCoursesId(studentCoursesId);
        studentCourses.setStudentReg(studentReg);
        studentCourses.setCourseCode(courseCode);
        studentCourses.setGrade(grade);

        return studentCoursesRepository.save(studentCourses);

    }


    //Delete methods
    public StudentCourses deleteById(int studentCoursesId){
        StudentCourses studentCourses=studentCoursesRepository.findByStudentCoursesId(studentCoursesId);
        studentCoursesRepository.delete(studentCourses);
        return studentCourses;

    }


    public String deleteAll(){
        studentCoursesRepository.deleteAll();
        return "Deleted all records";
    }

}
