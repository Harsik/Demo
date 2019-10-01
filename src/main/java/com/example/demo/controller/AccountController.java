package com.example.demo.controller;

import java.net.URI;

import com.example.demo.model.Account;
import com.example.demo.model.Profile;
import com.example.demo.payload.ApiResponse;
import com.example.demo.payload.LoginRequest;
import com.example.demo.payload.ProfilePayload;
import com.example.demo.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin
@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    
    @GetMapping("/profile")
    public Profile loadProfile(@RequestParam(value = "email") String email) {
        Profile profile = accountService.loadProfile(email);

        return profile;
    }

    @PostMapping("/profile/edit")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> editProfile(@RequestBody ProfilePayload profilePayload) {

        Account account = accountService.editProfile(profilePayload);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{accountId}")
                .buildAndExpand(account.getId()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true, "Profile edited Successfully"));
    }

}