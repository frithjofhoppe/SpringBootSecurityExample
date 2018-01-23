package com.techprimers.userservice.demo.repository;

import com.techprimers.userservice.demo.model.Users;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer>{
    Optional<Users> findByName(String username);
}
