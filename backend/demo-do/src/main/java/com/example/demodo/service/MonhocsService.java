package com.example.demodo.service;

import com.example.demodo.entity.Monhocs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface MonhocsService {

    Monhocs save(Monhocs monhocs);

    Optional<Monhocs> find(Integer id);

    List<Monhocs> findAll();

    List<Monhocs> findAll(Sort sort);

    Page<Monhocs> findAll(Pageable pageable);

    void delete(Integer id);

    void delete(Monhocs monhocs);

    void deleteAll();


    Monhocs getMHByIDMonHoc(Integer idMonHoc);

}