package com.zone.studentRegistrationDB.studentRegistrationDB.repository;


import com.zone.studentRegistrationDB.studentRegistrationDB.document.Courses;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends MongoRepository<Courses,Integer> {
    public Courses findByCourseCode(int courseCode);
}
