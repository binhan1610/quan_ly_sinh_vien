package com.example.demodo.repository;

import com.example.demodo.dto.SinhviensDTO;
import com.example.demodo.entity.Sinhviens;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SinhviensRepository extends JpaRepository<Sinhviens, Integer> {
    Optional<Sinhviens> findBymasv(String msv);

    Optional<Sinhviens> findByUserId(Integer userId);
    

}