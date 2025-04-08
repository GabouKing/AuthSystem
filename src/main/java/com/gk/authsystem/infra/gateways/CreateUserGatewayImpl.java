package com.gk.authsystem.infra.gateways;

import com.gk.authsystem.adapters.CreateUserGateway;
import com.gk.authsystem.core.model.User;
import com.gk.authsystem.infra.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CreateUserGatewayImpl implements CreateUserGateway {
    private final UserRepository userRepository;

    public CreateUserGatewayImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user)
    {
        String encryptedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(encryptedPassword);
        return userRepository.save(user);
    }
}
