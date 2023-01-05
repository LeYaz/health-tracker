package com.example.springboot.beans;

import com.example.springboot.dto.light.LightProfilDto;
import com.example.springboot.enums.EFoodPreference;
import com.example.springboot.enums.EUserSexe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity()
@Table(name="profil")
@NoArgsConstructor
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

    @OneToOne(mappedBy = "profil")
    private User user_id;

    @ManyToOne
    private Monitoring monitoring;

    @ManyToOne
    private Meal meal;

    @ManyToOne
    private Goal goal;

    public void update(LightProfilDto lightProfilDto){
        this.setName(lightProfilDto.getName() != null ? lightProfilDto.getName() : this.getName());
        this.setSurname(lightProfilDto.getSurname() != null ? lightProfilDto.getSurname() : this.getSurname());
        this.setHeight(lightProfilDto.getHeight() != null ? lightProfilDto.getHeight() : this.getHeight());
        this.setSexe(lightProfilDto.getSexe() != null ? lightProfilDto.getSexe() : this.getSexe());
        this.setBirth(lightProfilDto.getBirth() != null ? lightProfilDto.getBirth() : this.getBirth());
        this.setWeight(lightProfilDto.getWeight() != null ? lightProfilDto.getWeight() : this.getWeight());
        this.setFood_preference(lightProfilDto.getFood_preference() != null ? lightProfilDto.getFood_preference() : this.getFood_preference());

    }

}
