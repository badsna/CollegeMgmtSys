package com.example.collegemgmtsys.controller;

import com.example.collegemgmtsys.model.Course;
import com.example.collegemgmtsys.model.Enrollment;
import com.example.collegemgmtsys.pojo.course.CourseDetailRequestPojo;
import com.example.collegemgmtsys.pojo.enrollment.EnrollmentDetailRequestPojo;
import com.example.collegemgmtsys.service.enrollment.EnrollmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/enrollment")
public class EnrollmentController {
    private final EnrollmentServiceImpl enrollmentServiceImpl;

    @Autowired
    public EnrollmentController(EnrollmentServiceImpl enrollmentServiceImpl) {
        this.enrollmentServiceImpl = enrollmentServiceImpl;
    }

    @GetMapping
    public List<Enrollment> getEnrollment(){
        return enrollmentServiceImpl.getEnrollment();
    }

    @GetMapping("/{enrollment_id}")
    public Optional<Enrollment> getEnrollmentById(@PathVariable("enrollment_id") Integer enrollment_id){
        return enrollmentServiceImpl.getEnrollmentById(enrollment_id);
    }

    @PostMapping
    public void saveEnrollmentDetail(@RequestBody EnrollmentDetailRequestPojo enrollmentDetailRequestPojo){
        enrollmentServiceImpl.saveEnrollmentDetail(enrollmentDetailRequestPojo);
    }
}
