package com.gk.authsystem.infra.gateways;

import com.gk.authsystem.adapters.DeleteUserGateway;
import com.gk.authsystem.infra.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserGatewayImpl implements DeleteUserGateway {
    private final UserRepository userRepository;

    public DeleteUserGatewayImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }
}
