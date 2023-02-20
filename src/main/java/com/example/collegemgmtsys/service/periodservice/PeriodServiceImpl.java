package com.example.collegemgmtsys.service.periodservice;

import com.example.collegemgmtsys.model.Period;
import com.example.collegemgmtsys.model.Teacher;
import com.example.collegemgmtsys.pojo.period.PeriodDetailRequestPojo;
import com.example.collegemgmtsys.pojo.teacher.TeacherDetailRequestPojo;
import com.example.collegemgmtsys.repo.PeriodRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PeriodServiceImpl {
    public final PeriodRepo periodRepo;
    public final PeriodDetailRequestPojo periodDetailRequestPojo;
    public final ObjectMapper objectMapper;

    public List<Period> getPeriod() {
        return periodRepo.findAll();
    }

    public void savePeriodDetails(PeriodDetailRequestPojo periodDetailRequestPojo) {
        Period period;
        if(periodDetailRequestPojo.getPeriod_id()!=null){
            period=periodRepo.findById(periodDetailRequestPojo.getPeriod_id()).orElse(new Period());
        }
        period=objectMapper.convertValue(periodDetailRequestPojo,Period.class);
        periodRepo.save(period);
    }

    public Optional<Period> getPeriodById(Long period_id) {


        boolean exists=periodRepo.existsById(period_id);
        if(!exists){
            throw new IllegalStateException(
                    "period with id "+ period_id + "doesn't exists"
            );
        }
        return periodRepo.findById(period_id);
    }
}
