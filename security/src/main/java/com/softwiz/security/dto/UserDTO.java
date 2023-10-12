package com.softwiz.security.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class UserDTO {

    private Long userId;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}