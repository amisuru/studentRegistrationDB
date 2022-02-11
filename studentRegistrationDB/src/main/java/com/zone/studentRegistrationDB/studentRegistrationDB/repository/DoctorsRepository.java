package com.zone.studentRegistrationDB.studentRegistrationDB.repository;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.Doctors;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorsRepository  extends MongoRepository<Doctors,Integer> {
    public Doctors findByDoctorNo(int doctorNo);
}



