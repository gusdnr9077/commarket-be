package com.example.commarket.repository;

import com.example.commarket.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    boolean existsByNickname(String nickname);
}
