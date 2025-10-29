package com.missionfix.missionfix_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "utilisateurs")
@Getter
@Setter
@NoArgsConstructor //implemente automatique le constructeur vide
@AllArgsConstructor //implemente automatique le constructeur avec tout les attributs
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;//nom complet
    @Column(nullable = false, unique = true)
    private String username;// nom utilisateur
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String userPassword;//mot de passe
    @Column(nullable = false)
    private String city;//ville
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private LocalDate birthday;
    private String role; // // "ARTISAN" ou "ANNONCEUR"
    @Column(nullable = false)
    private String profession; // Exemple : "plombier", "menuisier"
    @Column(nullable = false)
    private int experienceYears;
//    private double latitude;
//    private double longitude;
    private String photo_profil;
    private String biography;
    private String address;

}
