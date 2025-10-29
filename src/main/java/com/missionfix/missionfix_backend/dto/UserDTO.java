package com.missionfix.missionfix_backend.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/**
 * classe qui sert uniquement à transférer des données entre le backend et le frontend, ou entre les couches du backend.
 * aucune logique métier
 * aucune annotation JPA (@Entity, @Table, etc.)
 * uniquement les champs nécessaires à l’échange de données
 */
public class UserDTO {
    private Long id;
    private String fullName;
    private String username;
    private String email;
    private String phoneNumber;
    private String city;
    private LocalDate birthday;
    private String role;
    private String photo_profil;
    private String address;
    private String biography;
}