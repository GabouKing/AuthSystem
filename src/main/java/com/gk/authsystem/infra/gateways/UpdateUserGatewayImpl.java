package com.gk.authsystem.infra.gateways;

import com.gk.authsystem.adapters.UpdateUserGateway;
import com.gk.authsystem.core.model.User;
import com.gk.authsystem.infra.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserGatewayImpl implements UpdateUserGateway {
    private final UserRepository userRepository;

    public UpdateUserGatewayImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User update(User user) {
        String encryptedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(encryptedPassword);



        double doub = 0.0;
        int inteiro = (int) doub; // 0.0 = 0


        try {
            int inteiro2 = Integer.parseInt(user.getName());
        }
        catch (NumberFormatException e) {

        }








        return userRepository.save(user);
    }
}
