package com.zone.studentRegistrationDB.studentRegistrationDB.repository;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.SemesterCourses;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterCoursesRepository extends MongoRepository<SemesterCourses,Integer> {
    public SemesterCourses findBySemesterCoursesId(int semesterCoursesId);
}
