package com.example.manager.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {

    private String id;
    private String password1;
    private String password2;
    private String name;
    private String address;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private LocalDate Registration;
    private LocalDate joinDate;
}
