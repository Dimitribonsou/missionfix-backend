package com.missionfix.missionfix_backend.controller;


import com.missionfix.missionfix_backend.dto.RegisterDTO;
import com.missionfix.missionfix_backend.dto.UserDTO;
import com.missionfix.missionfix_backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ✅ GET /api/users → Liste des utilisateurs
    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    // ✅ GET /api/users/{id} → Un utilisateur
    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // POST /register
    @PostMapping("/register")
    public ResponseEntity<UserDTO> registerUser(@Valid @RequestBody RegisterDTO registerDTO) {
        UserDTO createdUser = userService.createUser(registerDTO);
        return ResponseEntity.ok(createdUser);
    }


}
