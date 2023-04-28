package com.example.carrentapp.service;

import com.example.carrentapp.model.Role;

import java.util.List;

public interface RoleService {
    Role create(Role role);
    Role deleteById(Long id);
    List<Role> getAll();
    Role getById(Long id);
}
