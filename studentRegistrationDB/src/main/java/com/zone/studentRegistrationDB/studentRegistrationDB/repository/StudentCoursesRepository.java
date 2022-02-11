package com.zone.studentRegistrationDB.studentRegistrationDB.repository;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.StudentCourses;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCoursesRepository extends MongoRepository<StudentCourses,Integer> {
    public StudentCourses findByStudentCoursesId(int studentCoursesId);
    public List<StudentCourses> findByStudentReg(int studentReg);
}
