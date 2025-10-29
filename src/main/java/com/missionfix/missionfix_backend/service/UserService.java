package com.missionfix.missionfix_backend.service;

import com.missionfix.missionfix_backend.dto.UserDTO;
import com.missionfix.missionfix_backend.mapper.UserMapper;
import com.missionfix.missionfix_backend.model.User;
import com.missionfix.missionfix_backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static com.missionfix.missionfix_backend.utils.DateUtils.parseDate;

/**
 * Un Service contient la logique métier de ton application.
 * applique les règles de gestion
 * appelle les repositories
 * gère les mappers
 * et renvoie les DTOs au contrôleur
 */
@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper mapper;

    public UserService(UserRepository userRepository, UserMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    // 🧩 Récupérer tous les utilisateurs
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    // 🧩 Récupérer un utilisateur par ID
    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
        return mapper.toDto(user);
    }

    // 🧩 Créer un utilisateur
    public UserDTO createUser(UserDTO dto) {
        dto.setBirthday(parseDate(dto.getBirthday().toString()));
        User user = mapper.toEntity(dto);
        user = userRepository.save(user);
        return mapper.toDto(user);
    }
}
