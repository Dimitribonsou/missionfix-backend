package com.missionfix.missionfix_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter(){

        CorsConfiguration config = new CorsConfiguration();

        // origine autorisée ( ton app Angular)
        config.setAllowedOrigins(List.of("http://localhost:4200"));

        // Methode http autorisé
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));

        //Header autorizé
        config.setAllowedHeaders(List.of("Authorization", "Content-Type", "Accept"));

        // autorisée l'envoie des cookies / credentials
        config.setAllowCredentials(true);

        // durée du cache des règles CORS
        config.setMaxAge(3600L);

        // Application globale
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);

    }


}
