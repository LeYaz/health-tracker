package com.example.springboot.beans;

import com.example.springboot.enums.EFoodFamily;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity()
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "calorie")
    private Integer calorie;

    @Column(name = "quantity")
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "family")
    private EFoodFamily family;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "food_id", referencedColumnName = "id")
    private FoodComposition foodComposition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
