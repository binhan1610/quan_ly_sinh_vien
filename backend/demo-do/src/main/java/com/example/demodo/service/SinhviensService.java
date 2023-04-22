package com.example.demodo.service;

import com.example.demodo.entity.Sinhviens;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface SinhviensService {
    Optional<Sinhviens> findbyid_sinhvien(Integer id_sinhvien);

    Sinhviens save(Sinhviens sinhviens);

    Optional<Sinhviens> find(Integer id);

    List<Sinhviens> findAll();

    List<Sinhviens> findAll(Sort sort);

    Page<Sinhviens> findAll(Pageable pageable);

    void delete(Integer id);

    void delete(Sinhviens sinhviens);

    void deleteAll();

    long count();
    Optional<Sinhviens> findSvMsv(String msv);

}