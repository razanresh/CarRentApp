package com.example.carrentapp.service.impl;

import com.example.carrentapp.model.Role;
import com.example.carrentapp.repository.RoleRepository;
import com.example.carrentapp.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    @Override
    public Role create(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role deleteById(Long id) {
        Role role = getById(id);
        roleRepository.deleteById(id);
        return role;
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role getById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }
}
