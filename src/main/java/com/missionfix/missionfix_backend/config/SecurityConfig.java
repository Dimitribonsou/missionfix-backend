package com.missionfix.missionfix_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // désactive CSRF pour les requêtes API
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/**").permitAll() // autorise toutes les routes API
                        .anyRequest().permitAll()
                )
                .formLogin(login -> login.disable()) // désactive le formulaire de connexion
                .httpBasic(basic -> basic.disable()); // désactive l’authentification HTTP basique

        return http.build();
    }
}
