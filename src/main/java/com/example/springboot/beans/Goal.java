package com.example.springboot.beans;
import javax.persistence.*;

@Entity()
@Table(name = "goal")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "actual_weight")
    private double actual_weight;

    @Column(name = "goal_weight")
    private double goal_weight;

    @Column(name = "start_weight")
    private double start_weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
