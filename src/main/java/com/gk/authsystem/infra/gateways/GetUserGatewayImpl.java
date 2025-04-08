package com.gk.authsystem.infra.gateways;

import com.gk.authsystem.adapters.GetUserGateway;
import com.gk.authsystem.core.dto.UserDTO;
import com.gk.authsystem.infra.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetUserGatewayImpl implements GetUserGateway {
    private final UserRepository userRepository;

    public GetUserGatewayImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getUserById(Long userId) throws Exception {
        return userRepository.findById(userId).map(UserDTO::new)
                .orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream().map(UserDTO::new)
                .collect(Collectors.toList());
    }
}
