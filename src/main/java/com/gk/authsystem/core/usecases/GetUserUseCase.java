package com.gk.authsystem.core.usecases;

import com.gk.authsystem.core.dto.UserDTO;
import java.util.List;

public interface GetUserUseCase {
    UserDTO getUserById(Long userId) throws Exception;
    List<UserDTO> getAllUsers();
}
