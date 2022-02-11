package com.zone.studentRegistrationDB.studentRegistrationDB.service;

import com.zone.studentRegistrationDB.studentRegistrationDB.document.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zone.studentRegistrationDB.studentRegistrationDB.repository.StudentsRepository;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    private StudentsRepository studentRepository;


    //save methods
    public Students saveStudents(int studentReg,String address,String dateOfBirth,String mobileNo,String nationality,String phone,String studentName){
        return studentRepository.save(new Students(studentReg,address,dateOfBirth,mobileNo,nationality,phone,studentName));
    }


    //get methods
    public List<Students> getAllStudents(){
        return studentRepository.findAll();
   }


   public Students getByStudentReg(int studentReg){
        return studentRepository.findByStudentReg(studentReg);

   }

   //update method
   public Students updateStudent(int studentReg,String address,String birthday,String mobileNum,String nationality,String phone,String name){
       Students student = studentRepository.findByStudentReg(studentReg);
       student.setStudentName(name);
       student.setAddress(address);
       student.setDateOfBirth(birthday);
       student.setMobileNo(mobileNum);
       student.setNationality(nationality);
       student.setPhone(phone);
       return studentRepository.save(student);

   }


   //Delete methods
    public Students deleteById(int studentReg){
        Students students=studentRepository.findByStudentReg(studentReg);
         studentRepository.delete(students);
        return students;
    }


    public String deleteAll(){

        studentRepository.deleteAll();
        return "Deleted all records";
    }
}
