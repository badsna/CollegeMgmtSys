package com.example.collegemgmtsys.pojo.period;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
public class PeriodDetailResponsePojo {
    private Long period_id;

    private LocalTime start_time;
    private LocalTime end_time;
    private String location;
    private Duration duration;
}
