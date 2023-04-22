package com.example.demodo.service;

import com.example.demodo.entity.Admins;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface AdminsService {

    Admins save(Admins admins);

    Optional<Admins> find(Integer id);

    List<Admins> findAll();

    List<Admins> findAll(Sort sort);

    Page<Admins> findAll(Pageable pageable);

    void delete(Integer id);

    void delete(Admins admins);

    void deleteAll();

    long count();

}