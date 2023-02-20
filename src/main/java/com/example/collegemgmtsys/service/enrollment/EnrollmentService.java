package com.example.collegemgmtsys.service.enrollment;

import com.example.collegemgmtsys.model.Enrollment;
import com.example.collegemgmtsys.pojo.enrollment.EnrollmentDetailRequestPojo;

import java.util.List;
import java.util.Optional;

public interface EnrollmentService {

    public List<Enrollment> getEnrollment();

    public Optional<Enrollment> getEnrollmentById(Integer enrollment_id);

    public void saveEnrollmentDetail(EnrollmentDetailRequestPojo enrollmentDetailRequestPojo);
}
