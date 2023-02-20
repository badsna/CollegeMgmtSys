package com.example.collegemgmtsys.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalTime;

@Entity
@Table(name = "period")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Period {
    @Id
    @SequenceGenerator(
            name = "period_sequence",
            sequenceName = "period_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="period_sequence"
    )

    @Column(name = "period_id")
    private Long period_id;

    @Column(name = "start_time")
    private LocalTime start_time;

    @Column(name = "end_time")
    private LocalTime end_time;

    @Column(name = "location")
    private String location;

    @Column(name = "duration")
    private Duration duration;



    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = Duration.between(start_time,end_time);
    }

}
