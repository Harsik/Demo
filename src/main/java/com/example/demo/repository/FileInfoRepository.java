package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FileInfo;;

public interface FileInfoRepository extends JpaRepository<FileInfo, String> {
    Optional<FileInfo> findByName(String name);
    Boolean existsByName(String name);
}