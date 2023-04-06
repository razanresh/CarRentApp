package com.example.carrentapp.service;

import com.example.carrentapp.model.UserAccount;
import com.example.carrentapp.model.dto.UserAccountDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserAccountService {
    UserAccount create(UserAccountDTO userAccountDTO);
    UserAccount create(UserAccount userAccount);
    UserAccount deleteById(Long id);
    List<UserAccount> getAll();
    UserAccount getById(Long id);
    UserAccount getByLogin(String login);
}
