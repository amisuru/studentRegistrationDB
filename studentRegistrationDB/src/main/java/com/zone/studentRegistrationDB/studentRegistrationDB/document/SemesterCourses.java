package com.zone.studentRegistrationDB.studentRegistrationDB.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SemesterCourses {

    @Id
    String id;
    int semesterCoursesId;
    int doctorNo;
    int semesterId;
    int courseCode;


    public SemesterCourses(int semesterCoursesId,int doctorNo,int  semesterId,int courseCode){
        this.semesterCoursesId=semesterCoursesId;
        this.doctorNo= doctorNo;
        this.semesterId=semesterId;
        this.courseCode=courseCode;

    }


    public int getSemesterCoursesId() {
        return semesterCoursesId;
    }

    public void setSemesterCoursesId(int semesterCoursesId) {
        this.semesterCoursesId = semesterCoursesId;
    }

    public int getDoctorNo() {
        return doctorNo;
    }

    public void setDoctorNo(int doctorNo) {
        this.doctorNo = doctorNo;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
}
