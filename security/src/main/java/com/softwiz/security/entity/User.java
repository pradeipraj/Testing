package com.softwiz.security.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "User_Table")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "userId")
    private Long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}