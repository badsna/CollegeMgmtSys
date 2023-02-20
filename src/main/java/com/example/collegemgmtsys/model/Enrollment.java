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
@Table(name="enrollment")
public class Enrollment {
    @Id
    @SequenceGenerator(
            name="enrollment_sequence",
            sequenceName = "enrollment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "enrollment_sequence"
    )

    @Column(name="enrollment_id")
    private Integer enrollment_id;

    @Column(name="date")
    private String date;

//    @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
//    private List<Student> student;
}
