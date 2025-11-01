package com.missionfix.missionfix_backend.dto;

import com.missionfix.missionfix_backend.model.User;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * classe qui sert uniquement à transférer des données entre le backend et le frontend, ou entre les couches du backend.
 * aucune logique métier
 * aucune annotation JPA (@Entity, @Table, etc.)
 * uniquement les champs nécessaires à l’échange de données
 */
public class UserDTO {

    private long Id;

    @NotBlank(message = "Le nom complet est obligatoire")
    @Size(min = 2, max = 100, message = "Le nom complet doit contenir entre 2 et 100 caractères")
    private String fullName;

    @NotBlank(message = "L'email est obligatoire")
    @Email(message = "Format d'email invalide")
    private String email;

    @NotBlank(message = "Le nom d'utilisateur est obligatoire")
    @Size(min = 3, max = 50, message = "Le nom d'utilisateur doit contenir entre 3 et 50 caractères")
    @Pattern(regexp = "^[a-zA-Z0-9_-]+$", message = "Le nom d'utilisateur ne peut contenir que des lettres, chiffres, tirets et underscores")
    private String username;

    @NotBlank(message = "Le numéro de téléphone est obligatoire")
    @Pattern(regexp = "^\\+[1-9]\\d{1,14}$", message = "Format de numéro de téléphone invalide")
    private String phoneNumber;

    @NotBlank(message = "La ville est obligatoire")
    private String city;

    @NotBlank(message = "Le quartier est obligatoire")
    private String Adresse;

    @NotNull(message = "La date de naissance est obligatoire")
    @Past(message = "La date de naissance doit être dans le passé")
    private LocalDate birthday;

    @NotNull(message = "Le rôle est obligatoire")
    private String role;



}