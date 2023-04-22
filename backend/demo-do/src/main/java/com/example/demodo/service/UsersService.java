package com.example.demodo.service;

import com.example.demodo.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface UsersService {

    Users save(Users users);

    Optional<Users> find(Integer id);

    List<Users> findAll();

    List<Users> findAll(Sort sort);

    Page<Users> findAll(Pageable pageable);

    void delete(Integer id);

    void delete(Users users);

    void deleteAll();
    
    long count();
    Users login(String username, String password);

}