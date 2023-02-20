package com.example.collegemgmtsys.pojo.course;

import com.example.collegemgmtsys.pojo.period.PeriodDetailRequestPojo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Service
public class CourseDetailResponsePojo {

    private Long course_id;

    private String title;

    private String description;

    private String credit_hour;

    private String prerequisites;


    private List<PeriodDetailRequestPojo> period;

}
