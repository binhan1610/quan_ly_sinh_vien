package com.example.demodo.service;

import com.example.demodo.dto.BangdiemsDTO;
import com.example.demodo.entity.Bangdiems;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BangdiemsService {

    Bangdiems save(Bangdiems bangdiems);

    Optional<Bangdiems> find(Integer id);

    List<Bangdiems> findAll();

    List<Bangdiems> findAll(Sort sort);

    Page<Bangdiems> findAll(Pageable pageable);

    void delete(Integer id);

    void delete(Bangdiems bangdiems);

    void deleteAll();

  
    List<BangdiemsDTO> findListBangDiemByIDSv(Integer id);
    List<BangdiemsDTO> findListBangDiemByIDLophp(Integer id);
}