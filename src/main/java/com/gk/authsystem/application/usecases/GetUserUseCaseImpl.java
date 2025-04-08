package com.gk.authsystem.application.usecases;

import com.gk.authsystem.adapters.GetUserGateway;
import com.gk.authsystem.core.dto.UserDTO;
import com.gk.authsystem.core.usecases.GetUserUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserUseCaseImpl implements GetUserUseCase {
    private final GetUserGateway getUserGateway;

    public GetUserUseCaseImpl(GetUserGateway getUserGateway) {
        this.getUserGateway = getUserGateway;
    }

    @Override
    public UserDTO getUserById(Long userId) throws Exception {
        return getUserGateway.getUserById(userId);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return getUserGateway.getAllUsers();
    }
}
