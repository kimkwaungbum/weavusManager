package com.example.manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String password;
    private String name;
    private String address;
    private String email;
    private String phone;
    @Column(name="birth_date")
    private LocalDate birthDate;
    private LocalDate Registration;
    @Column(name="join_date")
    private LocalDate joinDate;
}
