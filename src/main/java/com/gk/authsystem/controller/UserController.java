package com.gk.authsystem.controller;

import com.gk.authsystem.adapters.CreateUserGateway;
import com.gk.authsystem.core.dto.UserDTO;
import com.gk.authsystem.core.model.User;
import com.gk.authsystem.core.usecases.CreateUserUseCase;
import com.gk.authsystem.core.usecases.DeleteUserUseCase;
import com.gk.authsystem.core.usecases.GetUserUseCase;
import com.gk.authsystem.core.usecases.UpdateUserUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final CreateUserUseCase createUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;
    private final GetUserUseCase getUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase, UpdateUserUseCase updateUserUseCase, DeleteUserUseCase deleteUserUseCase, GetUserUseCase getUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.updateUserUseCase = updateUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
        this.getUserUseCase = getUserUseCase;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return new ResponseEntity<>(getUserUseCase.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(getUserUseCase.getUserById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(createUserUseCase.create(user), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return new ResponseEntity<>(updateUserUseCase.update(user), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        deleteUserUseCase.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
