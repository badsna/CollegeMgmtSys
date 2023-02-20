package com.example.collegemgmtsys.service.studentservice;

import com.example.collegemgmtsys.model.Student;
import com.example.collegemgmtsys.pojo.student.StudentDetailRequestPojo;
import com.example.collegemgmtsys.repo.StudentRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    public final StudentRepo studentRepo;
    public final StudentDetailRequestPojo studentDetailRequestPojo;
    public final ObjectMapper objectMapper;

    @Override
    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long student_id) {
        boolean exists=studentRepo.existsById(student_id);
        if(!exists){
            throw new IllegalStateException("student with id "+ student_id +" does not exists");
        }
        return studentRepo.findById(student_id);
    }

    public void saveStudentDetail(StudentDetailRequestPojo studentDetailRequestPojo) {
        Student student;
        if(studentDetailRequestPojo.getStudent_id()!=null) {
            student = studentRepo.findById(studentDetailRequestPojo.getStudent_id()).orElse(new Student());
        }
        student=objectMapper.convertValue(studentDetailRequestPojo, Student.class);
        studentRepo.save(student);
    }
}
