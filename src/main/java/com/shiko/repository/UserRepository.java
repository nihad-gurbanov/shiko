package com.shiko.repository;

import com.shiko.entity.ShikoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ShikoUser, Long> {
    Boolean findUserByUsername(String username);
}
