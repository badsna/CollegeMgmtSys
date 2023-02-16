package com.example.collegemgmtsys.controller;

import com.example.collegemgmtsys.model.Student;
import com.example.collegemgmtsys.pojo.student.StudentDetailRequestPojo;
import com.example.collegemgmtsys.service.studentservice.StudentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/student")
@Validated
public class StudentController {
    private final StudentServiceImpl studentServiceImpl;

    @Autowired
    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }
    @GetMapping
    public List<Student> getStudent(){
        return studentServiceImpl.getStudent();
    }

    @GetMapping("/{student_ig}")
    public Optional<Student> getStudentById(@PathVariable("student_ig") Long student_id){
        return studentServiceImpl.getStudentById(student_id);
    }

    @PostMapping
    public void saveStudentDetail(@RequestBody @Valid StudentDetailRequestPojo studentDetailRequestPojo){
        studentServiceImpl.saveStudentDetail(studentDetailRequestPojo);
    }
}
