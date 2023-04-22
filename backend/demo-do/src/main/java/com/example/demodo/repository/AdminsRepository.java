package com.example.demodo.repository;

import com.example.demodo.entity.Admins;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminsRepository extends JpaRepository<Admins, Integer> {
}