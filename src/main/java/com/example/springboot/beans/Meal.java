package com.example.springboot.beans;

import com.example.springboot.enums.EReceipeCategory;
import com.example.springboot.enums.EReceipeType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity()
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "label")
    private String label;

    @Column(name = "date")
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private EReceipeType type;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private EReceipeCategory category;

    @Column(name = "is_favorite")
    private Boolean is_favorite;

    @ManyToOne
    private Food food;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
