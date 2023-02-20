package com.example.collegemgmtsys.service.periodservice;

import com.example.collegemgmtsys.model.Period;
import com.example.collegemgmtsys.pojo.period.PeriodDetailRequestPojo;

import java.util.List;
import java.util.Optional;

public interface PeriodService {
    List<Period> getPeriod();
    public Optional<Period> getperiodById(Long period_id);
    public void savePeriodDetails(PeriodDetailRequestPojo periodDetailRequestPojo);
}
