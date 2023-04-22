package com.example.demodo.repository;

import com.example.demodo.dto.BangdiemsDTO;
import com.example.demodo.entity.Bangdiems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface BangdiemsRepository extends JpaRepository<Bangdiems, Integer> {



    @Query(value="SELECT * FROM bangdiems where sinhviens_id= ?1",nativeQuery = true)
    List<Bangdiems> find_diem_by_idsv(long id);
    @Query(value="SELECT * FROM bangdiems where lophps_id= ?1",nativeQuery = true)
    List<Bangdiems> find_diem_by_idlophp(long id);
}