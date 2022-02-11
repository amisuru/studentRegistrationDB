package com.zone.studentRegistrationDB.studentRegistrationDB.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StudentCourses {

     @Id
     String id;
     int studentCoursesId;
     int studentReg;
     int courseCode;
     String grade;

    public StudentCourses(int studentCoursesId,int studentReg, int courseCode, String grade){
        this.studentCoursesId=studentCoursesId;
        this.studentReg=studentReg;
        this.courseCode=courseCode;
        this.grade=grade;

    }

    public int getStudentCoursesId() {
        return studentCoursesId;
    }

    public void setStudentCoursesId(int studentCoursesId) {
        this.studentCoursesId = studentCoursesId;
    }

    public int getStudentReg() {
        return studentReg;
    }

    public void setStudentReg(int studentReg) {
        this.studentReg = studentReg;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
