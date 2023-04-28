package com.example.carrentapp.service.impl;

import com.example.carrentapp.model.Role;
import com.example.carrentapp.model.UserAccount;
import com.example.carrentapp.model.dto.UserAccountDTO;
import com.example.carrentapp.repository.UserAccountRepository;
import com.example.carrentapp.service.CarService;
import com.example.carrentapp.service.RoleService;
import com.example.carrentapp.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserAccountServiceImpl implements UserAccountService {
    private final UserAccountRepository userAccountRepository;
    private final PasswordEncoder encoder;
    private final RoleService roleService;
    @Override
    public UserAccount create(UserAccountDTO userAccountDTO) {
        UserAccount userAccount = new UserAccount();
        userAccount.setName(userAccountDTO.getName());
        userAccount.setLastname(userAccount.getLastname());
        userAccount.setEmail(userAccount.getEmail());
        userAccount.setPassword(encoder.encode(userAccountDTO.getPassword()));
        userAccount.setLogin(userAccount.getLogin());
        userAccount.setIsActive(userAccountDTO.getIsActive());
        Role role = roleService.getById(1L);
        return userAccount;
    }

    @Override
    public UserAccount create(UserAccount userAccount) {
        userAccount.setPassword(encoder.encode(userAccount.getPassword()));
        userAccountRepository.save(userAccount);


        return userAccount;
    }

    @Override
    public UserAccount deleteById(Long id) {
        UserAccount userAccount = getById(id);
        if(userAccount != null){

        }
        userAccountRepository.deleteById(id);
        return userAccount;
    }

    @Override
    public List<UserAccount> getAll() {
        return userAccountRepository.findAll();
    }

    @Override
    public UserAccount getById(Long id) {
        return userAccountRepository.findById(id).orElse(null);
    }

    @Override
    public UserAccount getByLogin(String login) {
        return userAccountRepository.findByLogin(login);
    }
}
