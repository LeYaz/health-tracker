package com.example.springboot.beans;

import com.example.springboot.enums.EFoodPreference;
import com.example.springboot.enums.EUserSexe;

import javax.persistence.*;
import java.util.Date;

@Entity()
@Table(name="profil")
public class Profil {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "height")
    private Integer height;

    @Column(name = "sexe")
    private Enum<EUserSexe> sexe;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "birth")
    private Date birth;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "food_preference")
    private Enum<EFoodPreference> food_preference;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user_id;

    @ManyToOne
    private Monitoring monitoring;

    @ManyToOne
    private Receipe receipe;

    @ManyToOne
    private Goal goal;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Enum getSexe() {
        return sexe;
    }

    public void setSexe(Enum sexe) {
        this.sexe = sexe;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Enum getFood_preference() {
        return food_preference;
    }

    public void setFood_preference(Enum food_preference) {
        this.food_preference = food_preference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
