package com.missionfix.missionfix_backend.dto;

import com.missionfix.missionfix_backend.model.User;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {


    private Long id;
    private String fullName;
    private String email;
    private String username;
    private String phoneNumber;
    private String city;
    private String adresse;
    private LocalDate birthday;
    private String role;
    private Boolean active;
    private LocalDateTime createdAt;




}
