package com.example.collegemgmtsys.pojo.enrollment;

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
public class EnrollmentDetailResponsePojo {

    private Integer enrollment_id;

    private String date;

//    private Long student_id;
}
