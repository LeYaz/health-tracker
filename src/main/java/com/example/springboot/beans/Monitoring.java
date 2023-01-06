package com.example.springboot.beans;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity()
@Table(name = "monitoring")
public class Monitoring {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "weight")
    private double weight;

    @Column(name = "date")
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
