package com.example.collegemgmtsys.repo;

import com.example.collegemgmtsys.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepo extends JpaRepository<Enrollment, Integer> {
}
