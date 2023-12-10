package com.hexaware.springsecuritybcrypt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springsecuritybcrypt.entity.UserInfo;
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);

}