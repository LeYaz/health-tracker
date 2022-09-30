package com.example.springboot.beans;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;

@Entity()
@Table(name = "foodcomposition")
public class FoodComposition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "glucides")
    private Integer glucides;

    @Column(name = "lipides")
    private Integer lipides;

    @Column(name = "proteins")
    private Integer proteins;

    @Column(name = "sugar")
    private Integer sugar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
