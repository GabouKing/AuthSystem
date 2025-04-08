package com.gk.authsystem.core.dto;

import com.gk.authsystem.core.enums.UserType;
import com.gk.authsystem.core.model.User;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private UserType userType;

    public UserDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.userType = user.getUserType();
    }
}
