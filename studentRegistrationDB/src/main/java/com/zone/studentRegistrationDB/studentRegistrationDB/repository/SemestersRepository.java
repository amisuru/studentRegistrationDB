package com.zone.studentRegistrationDB.studentRegistrationDB.repository;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.Semesters;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestersRepository extends MongoRepository<Semesters,Integer> {
    public Semesters findBySemesterId(int semesterId);
}
