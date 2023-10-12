package com.softwiz.security.controller;

import com.softwiz.security.dto.UserDTO;
import com.softwiz.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDTO userDTO){
        try {
            userService.registerUser(userDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}