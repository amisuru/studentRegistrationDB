package com.zone.studentRegistrationDB.studentRegistrationDB.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Courses {



    @Id
    String id;
    int courseCode;
    String courseName;
    String creditHrs;
    String description;
    public Courses(int courseCode,String courseName,String  creditHrs,String description){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.creditHrs= creditHrs;
        this.description= description;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCreditHrs() {
        return creditHrs;
    }

    public void setCreditHrs(String creditHrs) {
        this.creditHrs = creditHrs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
