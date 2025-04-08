package com.gk.authsystem.application.usecases;

import com.gk.authsystem.adapters.CreateUserGateway;
import com.gk.authsystem.core.model.User;
import com.gk.authsystem.core.usecases.CreateUserUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private final CreateUserGateway createUserGateway;
    public CreateUserUseCaseImpl(CreateUserGateway createUserGateway) {
        this.createUserGateway = createUserGateway;
    }

    @Override
    public User create(User user) {
        return createUserGateway.create(user);
    }
}
