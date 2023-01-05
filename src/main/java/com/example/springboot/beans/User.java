package com.example.springboot.beans;

import com.example.springboot.dto.light.LightUserDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity()
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "profil_id", referencedColumnName = "id")
    private Profil profil;

    public void update(LightUserDto lightUserDto){
        if(lightUserDto.getEmail() != null){
            this.setEmail(lightUserDto.getEmail());
        }
        if(lightUserDto.getPassword() != null){
            this.setPassword(lightUserDto.getPassword());
        }
    }
}
