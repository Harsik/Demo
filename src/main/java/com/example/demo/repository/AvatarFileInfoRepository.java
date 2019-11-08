package com.example.demo.repository;

import java.util.Optional;

import com.example.demo.model.AvatarFileInfo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AvatarFileInfoRepository extends JpaRepository<AvatarFileInfo, String> {
    Optional<AvatarFileInfo> findByProfileId(Long ProfileId);
    //  Set<FileInfo>  findByAccountId(Long AccountId);

    Boolean existsByProfileId(Long ProfileId);
}