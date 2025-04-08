package com.gk.authsystem.adapters;

import com.gk.authsystem.core.model.User;

public interface CreateUserGateway {
    User create(User user);
}
