package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.payload.LoginRequest;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService{

        @Autowired
        private AccountRepository accountRepository;

        public void saveAccount(LoginRequest loginRequest) {
                Account account = new Account(loginRequest.getEmail(), loginRequest.getPassword());
                accountRepository.save(account);
        }

}