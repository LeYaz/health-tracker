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
    private double glucides;

    @Column(name = "lipides")
    private double lipides;

    @Column(name = "proteins")
    private double proteins;

    @Column(name = "sugar")
    private double sugar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
