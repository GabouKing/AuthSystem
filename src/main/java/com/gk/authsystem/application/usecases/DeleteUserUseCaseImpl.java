package com.gk.authsystem.application.usecases;

import com.gk.authsystem.adapters.DeleteUserGateway;
import com.gk.authsystem.core.usecases.DeleteUserUseCase;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserUseCaseImpl implements DeleteUserUseCase {
    private final DeleteUserGateway deleteUserGateway;
    public DeleteUserUseCaseImpl(DeleteUserGateway deleteUserGateway) {
        this.deleteUserGateway = deleteUserGateway;
    }
    @Override
    public void delete(Long userId) {
        deleteUserGateway.delete(userId);
    }
}
