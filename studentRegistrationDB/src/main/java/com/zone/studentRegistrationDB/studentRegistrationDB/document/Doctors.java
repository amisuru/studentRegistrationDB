package com.zone.studentRegistrationDB.studentRegistrationDB.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Doctors {
    @Id
    String id;
    int doctorNo;
    String doctorName;
    String qualifications;

    public Doctors(int doctorNo,String doctorName,String  qualifications){
        this.doctorNo=doctorNo;
        this.doctorName=doctorName;
        this. qualifications= qualifications;

    }

    public int getDoctorNo() {
        return doctorNo;
    }

    public void setDoctorNo(int doctorNo) {
        this.doctorNo = doctorNo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
