package com.softwiz.security.service;

import com.softwiz.security.configuration.SecurityConfig;
import com.softwiz.security.dto.UserDTO;
import com.softwiz.security.entity.User;
import com.softwiz.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    public void registerUser(UserDTO userDTO){
        //Create a new User
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepository.save(user);
    }
}
