package com.example.carrentapp.model.dto;

import lombok.Data;

@Data
public class UserAccountDTO {
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String login;
    private String password;
    private Boolean isActive;
}
