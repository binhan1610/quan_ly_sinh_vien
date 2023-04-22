package com.example.demodo.service;

import com.example.demodo.entity.Lophps;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface LophpsService {

    Lophps save(Lophps lophps);

    Optional<Lophps> find(Integer id);

    List<Lophps> findAll();

    List<Lophps> findAll(Sort sort);

    Page<Lophps> findAll(Pageable pageable);

    void delete(Integer id);

    void delete(Lophps lophps);

    void deleteAll();

    long count();

    String findtenmonhocByidlophp(Integer lophpId);

    

}