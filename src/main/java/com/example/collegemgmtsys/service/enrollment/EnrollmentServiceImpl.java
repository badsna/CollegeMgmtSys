package com.example.collegemgmtsys.service.enrollment;

import com.example.collegemgmtsys.model.Enrollment;
import com.example.collegemgmtsys.model.Student;
import com.example.collegemgmtsys.pojo.enrollment.EnrollmentDetailRequestPojo;
import com.example.collegemgmtsys.repo.EnrollmentRepo;
import com.example.collegemgmtsys.repo.StudentRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService{
    public final EnrollmentRepo enrollmentRepo;
    public final EnrollmentDetailRequestPojo enrollmentDetailRequestPojo;
    public final ObjectMapper objectMapper;
//    public final StudentRepo studentRepo;

    public List<Enrollment> getEnrollment() {
        return enrollmentRepo.findAll();
    }

    public Optional<Enrollment> getEnrollmentById(Integer enrollment_id) {
        boolean exists=enrollmentRepo.existsById(enrollment_id);
        if(!exists){
            throw new IllegalStateException("student with id "+ enrollment_id +" does not exists");
        }
        return enrollmentRepo.findById(enrollment_id);
    }

    public void saveEnrollmentDetail(EnrollmentDetailRequestPojo enrollmentDetailRequestPojo) {
        Enrollment enrollment;
        if(enrollmentDetailRequestPojo.getEnrollment_id()!=null) {
            enrollment = enrollmentRepo.findById(enrollmentDetailRequestPojo.getEnrollment_id()).orElse(new Enrollment());
        }
        enrollment=objectMapper.convertValue(enrollmentDetailRequestPojo, Enrollment.class);
//        List<Student> students= studentRepo.findAllById(enrollmentDetailRequestPojo.getStudent_id());
//        if (students.size() != enrollmentDetailRequestPojo.getStudent_id().size())
//            throw new IllegalStateException("Students does not exist");
//        enrollment.setStudent(students);

        System.out.println("Hello Rujan");
        enrollmentRepo.save(enrollment);
    }
}
