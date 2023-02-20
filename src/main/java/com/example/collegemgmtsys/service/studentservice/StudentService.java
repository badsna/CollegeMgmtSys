package com.example.collegemgmtsys.service.studentservice;

import com.example.collegemgmtsys.model.Student;
import com.example.collegemgmtsys.pojo.student.StudentDetailRequestPojo;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public List<Student> getStudent();

    public Optional<Student> getStudentById(Long student_id);

    public void saveStudentDetail(StudentDetailRequestPojo studentDetailRequestPojo);
}
