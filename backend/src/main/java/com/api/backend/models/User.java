package com.api.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id_user")
    private Long idUser;

    @Column(name="identification_type")
    private String identificationType;

    @Column(name="user_identification_number")
    private Integer userIdentificationNumber;

    private String password;

}
