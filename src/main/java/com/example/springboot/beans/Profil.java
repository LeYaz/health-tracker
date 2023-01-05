package com.example.springboot.beans;

import com.example.springboot.enums.EFoodPreference;
import com.example.springboot.enums.EUserSexe;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
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
    private double height;

    @Column(name = "sexe")
    private Enum<EUserSexe> sexe;

    @Column(name = "created_at")
    private LocalDate created_at;

    @Column(name = "birth")
    private LocalDate birth;

    @Column(name = "weight")
    private double weight;

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

    @Transient
    private Integer age;

    public Profil() {
    }

    public Profil(Long id, String name, String surname,
                  double weight, double height, User user_id, int age){

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.weight =weight;
        this.height = height;
        this.user_id = user_id;
        this.age = age;
    }

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

    public double getHeight() {
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

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public double getWeight(double weight) {
        return this.weight;
    }

    public void setWeight(double weight) {
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

    public int getAge(){
        return Period.between(this.birth, LocalDate.now()).getYears();
    }

    public void setId(Long id) {
        this.id = id;
    }
}
