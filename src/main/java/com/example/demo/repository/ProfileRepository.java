package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile,Long>{
    Optional<Profile> findByAccountId(Long accountId);
    Boolean existsByAccountId(Long accountId);
}