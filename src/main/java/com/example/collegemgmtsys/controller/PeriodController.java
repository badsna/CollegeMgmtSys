package com.example.collegemgmtsys.controller;

import com.example.collegemgmtsys.model.Period;
import com.example.collegemgmtsys.model.Teacher;
import com.example.collegemgmtsys.pojo.period.PeriodDetailRequestPojo;
import com.example.collegemgmtsys.pojo.teacher.TeacherDetailRequestPojo;
import com.example.collegemgmtsys.service.periodservice.PeriodServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/period")
public class PeriodController {
    private final PeriodServiceImpl periodServiceImpl;

    @Autowired
    public PeriodController(PeriodServiceImpl periodServiceImpl) {
        this.periodServiceImpl = periodServiceImpl;
    }
    @GetMapping
    public List<Period> getPeriod(){
        return periodServiceImpl.getPeriod();
    }

    @GetMapping("{periodId}")
    public Optional<Period> getTeacherById(@PathVariable("periodId") Long period_id){
        return  periodServiceImpl.getPeriodById(period_id);
    }


    @PostMapping
    public void savePeriodDetails(@RequestBody @Valid PeriodDetailRequestPojo periodDetailRequestPojo){
        periodServiceImpl.savePeriodDetails(periodDetailRequestPojo);
    }
}
