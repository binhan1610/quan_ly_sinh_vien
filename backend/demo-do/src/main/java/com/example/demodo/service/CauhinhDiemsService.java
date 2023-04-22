package com.example.demodo.service;

import com.example.demodo.entity.CauhinhDiems;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface CauhinhDiemsService {

    CauhinhDiems save(CauhinhDiems cauhinhdiems);

    Optional<CauhinhDiems> find(Integer id);

    List<CauhinhDiems> findAll();

    List<CauhinhDiems> findAll(Sort sort);

    Page<CauhinhDiems> findAll(Pageable pageable);

    void delete(Integer id);

    void delete(CauhinhDiems cauhinhdiems);

    void deleteAll();

    long count();

}