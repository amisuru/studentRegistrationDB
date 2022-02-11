package com.zone.studentRegistrationDB.studentRegistrationDB.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Students {
    @Id
    String id;
    int studentReg;
    String address;
    String dateOfBirth;
    String mobileNo;
    String nationality;
    String phone;
    String studentName;



    public Students(int studentReg,String address,String dateOfBirth,String mobileNo,String nationality,String phone,String studentName){
        this.studentReg =studentReg;
        this.address=address;
        this.dateOfBirth=dateOfBirth;
        this.mobileNo=mobileNo;
        this.nationality=nationality;
        this.phone=phone;
        this.studentName=studentName;
    }

    public int getStudentReg() {
        return studentReg;
    }

    public void setStudentReg(int studentReg) {
        this.studentReg = studentReg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
