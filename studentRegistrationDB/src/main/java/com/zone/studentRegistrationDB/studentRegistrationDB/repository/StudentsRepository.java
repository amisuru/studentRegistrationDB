package com.zone.studentRegistrationDB.studentRegistrationDB.repository;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.Students;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends MongoRepository<Students,Integer> {
    public Students findByStudentReg(int studentReg);

}
