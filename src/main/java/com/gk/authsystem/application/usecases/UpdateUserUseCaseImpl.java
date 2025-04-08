package com.gk.authsystem.application.usecases;

import com.gk.authsystem.adapters.UpdateUserGateway;
import com.gk.authsystem.core.model.User;
import com.gk.authsystem.core.usecases.UpdateUserUseCase;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserUseCaseImpl implements UpdateUserUseCase {
    private final UpdateUserGateway updateUserGateway;

    public UpdateUserUseCaseImpl(UpdateUserGateway updateUserGateway) {
        this.updateUserGateway = updateUserGateway;
    }

    @Override
    public User update(User user) {
        return updateUserGateway.update(user);
    }
}
