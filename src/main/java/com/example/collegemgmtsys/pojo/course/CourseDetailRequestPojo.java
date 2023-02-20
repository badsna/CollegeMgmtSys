package com.example.collegemgmtsys.pojo.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Service
public class CourseDetailRequestPojo {

    private Long course_id;

    private String title;

    private String description;

    private String credit_hour;

    private String prerequisites;
}
