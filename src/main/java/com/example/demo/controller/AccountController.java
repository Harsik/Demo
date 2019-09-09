package com.example.demo.controller;

import com.example.demo.payload.LoginRequest;
import com.example.demo.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;
    
    // @CrossOrigin
    // // @RequestMapping("/saveAccount")
    // @PostMapping("/saveAccount")
    // public ResponseEntity<?> saveAccount(@RequestBody LoginRequest loginRequest) {
    //     accountService.saveAccount(loginRequest);
    //     return ResponseEntity.ok("");
    // }

}