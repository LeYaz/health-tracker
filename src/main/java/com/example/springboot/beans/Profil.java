package com.example.springboot.beans;

import com.example.springboot.dto.light.LightProfilDto;
import com.example.springboot.enums.EFoodPreference;
import com.example.springboot.enums.EUserSexe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity()
@Table(name="profil")
@Getter
@Setter
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

    @Enumerated(EnumType.STRING)
    @Column(name = "sexe")
    private EUserSexe sexe;

    @Column(name = "created_at")
    private LocalDate created_at;

    @Column(name = "birth")
    private LocalDate birth;

    @Column(name = "weight")
    private double weight;

    @Enumerated(EnumType.STRING)
    @Column(name = "food_preference")
    private EFoodPreference food_preference;

    @OneToOne(mappedBy = "profil")
    private User user_id;

    @ManyToOne
    private Monitoring monitoring;

    @ManyToOne
    private Meal meal;

    @ManyToOne
    private Goal goal;

    public Profil(){
        this.setCreated_at(LocalDate.now());
    }
    public void update(LightProfilDto lightProfilDto){
        this.setName(lightProfilDto.getName() != null ? lightProfilDto.getName() : this.getName());
        this.setSurname(lightProfilDto.getSurname() != null ? lightProfilDto.getSurname() : this.getSurname());
        this.setHeight(lightProfilDto.getHeight() != 0.0d ? lightProfilDto.getHeight() : this.getHeight());
        this.setSexe(lightProfilDto.getSexe() != null ? lightProfilDto.getSexe() : this.getSexe());
        this.setBirth(lightProfilDto.getBirth() != null ? lightProfilDto.getBirth() : this.getBirth());
        this.setWeight(lightProfilDto.getWeight() != 0.0d ? lightProfilDto.getWeight() : this.getWeight());
        this.setFood_preference(lightProfilDto.getFood_preference() != null ? lightProfilDto.getFood_preference() : this.getFood_preference());

    }

}
