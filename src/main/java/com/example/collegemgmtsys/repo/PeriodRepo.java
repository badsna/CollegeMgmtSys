package com.example.collegemgmtsys.repo;

import com.example.collegemgmtsys.model.Period;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodRepo extends JpaRepository<Period,Long> {
}
