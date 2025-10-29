package com.missionfix.missionfix_backend.mapper;
import com.missionfix.missionfix_backend.dto.UserDTO;
import com.missionfix.missionfix_backend.model.User;
import org.springframework.stereotype.Component;

@Component
/**
 * Il fait le pont entre la base de données et l’API.
 * Un Mapper est une classe qui convertit les objets :
 * de l’entité JPA → vers le DTO
 *
 * et parfois du DTO → vers l’entité
 */
public class UserMapper {
    // convertion du DTO → vers l’entité
    public UserDTO toDto(User user) {
        if (user == null) return null;
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setFullName(user.getFullName());
        dto.setEmail(user.getEmail());
        dto.setPhoneNumber(user.getPhoneNumber());
        dto.setRole(user.getRole());
        dto.setBirthday(user.getBirthday());
        dto.setCity(user.getCity());
        dto.setUsername(user.getUsername());
        dto.setAddress(user.getAddress());
        dto.setBiography(user.getBiography());
        return dto;
    }
    // convertion de l’entité JPA → vers le DTO
    public User toEntity(UserDTO dto) {
        if (dto == null) return null;
        User user = new User();
        user.setFullName(dto.getFullName());
        user.setEmail(dto.getEmail());
        return user;
    }
}

