package com.gk.authsystem.controller;

import com.gk.authsystem.core.dto.AuthenticationDTO;
import com.gk.authsystem.core.dto.LoginResponseDTO;
import com.gk.authsystem.core.model.User;
import com.gk.authsystem.infra.security.service.TokenService;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    public AuthenticationController(AuthenticationManager authenticationManager, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody @Valid AuthenticationDTO data){
        var useranamePassword = new UsernamePasswordAuthenticationToken(data.email(),data.password());
        var auth = authenticationManager.authenticate(useranamePassword);
        var token = tokenService.generateToken((User) auth.getPrincipal());
        return ResponseEntity.ok().body(new LoginResponseDTO(token));
    }
}
