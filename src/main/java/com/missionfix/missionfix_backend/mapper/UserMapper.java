package com.missionfix.missionfix_backend.mapper;
import com.missionfix.missionfix_backend.dto.RegisterDTO;
import com.missionfix.missionfix_backend.dto.UserDTO;
import com.missionfix.missionfix_backend.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;
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

        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setFullName(user.getFullName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setRole(user.getRole());
        userDTO.setBirthday(user.getBirthday());
        userDTO.setCity(user.getCity());
        userDTO.setAdresse(user.getAddress());
        userDTO.setUsername(user.getUsername());

        return userDTO;
    }





    public User toEntity(RegisterDTO registerDTO) {
        User user = new User();
        user.setFullName(registerDTO.getFullName());
        user.setUsername(registerDTO.getUsername());
        user.setEmail(registerDTO.getEmail());
        user.setPhoneNumber(registerDTO.getPhoneNumber());
        user.setCity(registerDTO.getCity());  // ville
        user.setAddress(registerDTO.getAddress());  // quatier
        user.setBirthday(registerDTO.getBirthday());
        user.setUserPassword(registerDTO.getUserPassword());
        user.setRole(registerDTO.getRole());
        return user;
    }

}

