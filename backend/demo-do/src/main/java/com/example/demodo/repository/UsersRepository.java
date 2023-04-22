package com.example.demodo.repository;

import com.example.demodo.entity.Users;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByUsernameAndPassword(String username, String password);
    
}