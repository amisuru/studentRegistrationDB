package com.zone.studentRegistrationDB.studentRegistrationDB.service;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.Courses;
import com.zone.studentRegistrationDB.studentRegistrationDB.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;

    //Save methods
    public Courses serveCourses(int courseCode,String courseName, String creditHrs, String description) {
        return coursesRepository.save(new Courses(courseCode,courseName,creditHrs,description));
    }



    //Get methods
    public List<Courses> getAllCourses(){
        return coursesRepository.findAll();
    }

    public Courses getByCoursesCode(int coursesCode){
        return coursesRepository.findByCourseCode(coursesCode);

    }

    //Update method
    public Courses updateCourse(int coursesCode,String courseName ,String creditHrs,String description){
        Courses courses = coursesRepository.findByCourseCode(coursesCode);
        courses.setCourseName(courseName);
        courses.setCreditHrs(creditHrs);
        courses.setDescription(description);
        return coursesRepository.save(courses);

    }


    //Delete methods
    public Courses deleteByCoursesCode(int coursesCode){
        Courses courses=coursesRepository.findByCourseCode(coursesCode);
        coursesRepository.delete(courses);
        return courses;
    }


    public String deleteAll(){
        coursesRepository.deleteAll();
        return "Deleted all records";
    }
}
