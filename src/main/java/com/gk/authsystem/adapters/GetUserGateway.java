package com.gk.authsystem.adapters;

import com.gk.authsystem.core.dto.UserDTO;

import java.util.List;

public interface GetUserGateway {
    UserDTO getUserById(Long userId) throws Exception;

    List<UserDTO> getAllUsers();
}
