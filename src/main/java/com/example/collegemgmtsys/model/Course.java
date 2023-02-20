package com.example.collegemgmtsys.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="course")
public class Course {
    @Id
    @SequenceGenerator(
            name="course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )

    @Column(name="course_id")
    private Long course_id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="credit_hour")
    private String credit_hour;

    @Column(name="prerequisites")
    private String prerequisites;

    //onecourse have many period
    @OneToMany(mappedBy = "course")
    private List<Period> period;
}
