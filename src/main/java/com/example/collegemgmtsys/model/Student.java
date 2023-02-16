package com.example.collegemgmtsys.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="student", uniqueConstraints = {@UniqueConstraint(columnNames = "email", name = "UNIQUE_student_email")})
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    @Column(name="student_id")
    private Long student_id;

    @Column(name="student_name")
    private String student_name;

    @Column(name="dob")
    private LocalDate dob;

    @Column(name="phone")
    private Long phone;

    @Column(name="email")
    private String email;

    @Column(name="address")
    private String address;


}
