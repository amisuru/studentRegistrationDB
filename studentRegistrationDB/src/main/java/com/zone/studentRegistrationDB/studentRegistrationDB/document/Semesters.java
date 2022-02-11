package com.zone.studentRegistrationDB.studentRegistrationDB.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Semesters {
    @Id
    String id;
    int semesterId;
    int semesterSeason;
    int semesterYear;


    public Semesters(int semesterId,int semesterSeason,int semesterYear){
        this.semesterId=semesterId;
        this.semesterSeason=semesterSeason;
        this.semesterYear=semesterYear;

    }

    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }

    public int getSemesterSeason() {
        return semesterSeason;
    }

    public void setSemesterSeason(int semesterSeason) {
        this.semesterSeason = semesterSeason;
    }

    public int getSemesterYear() {
        return semesterYear;
    }

    public void setSemesterYear(int semesterYear) {
        this.semesterYear = semesterYear;
    }
}
