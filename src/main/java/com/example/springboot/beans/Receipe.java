package com.example.springboot.beans;

import javax.persistence.*;
import java.util.Date;

@Entity()
@Table(name = "meal")
public class Receipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "label")
    private String label;

    @Column(name = "date")
    private Date date;

    @Column(name = "type")
    private Enum type;

    @Column(name = "category")
    private Enum category;

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
