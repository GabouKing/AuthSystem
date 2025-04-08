package com.gk.authsystem.core.usecases;

import com.gk.authsystem.core.model.User;

public interface CreateUserUseCase {
    User create(User user);
}
