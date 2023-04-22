package com.example.demodo.service;

import com.example.demodo.entity.Sinhviens;
import com.example.demodo.repository.SinhviensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class SinhviensServiceImpl implements SinhviensService {

    @Autowired
    private SinhviensRepository sinhviensRepository;

    @Override
    public Sinhviens save(Sinhviens sinhviens) {
        return sinhviensRepository.save(sinhviens);
    }

    @Override
    public Optional<Sinhviens> find(Integer id) {
        return sinhviensRepository.findById(id);
    }

    @Override
    public List<Sinhviens> findAll() {
        return sinhviensRepository.findAll();
    }

    @Override
    public List<Sinhviens> findAll(Sort sort){
        return sinhviensRepository.findAll(sort);
    }

    @Override
    public Page<Sinhviens> findAll(Pageable pageable){
        return sinhviensRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
    sinhviensRepository.deleteById(id);
    }

    @Override
    public void delete(Sinhviens sinhviens) {
        sinhviensRepository.delete(sinhviens);
    }

    @Override
    public void deleteAll() {
        sinhviensRepository.deleteAll();
    }

    @Override
    public long count() {
        return sinhviensRepository.count();
    }

    @Override
    public Optional<Sinhviens> findSvMsv(String msv) {
       return sinhviensRepository.findBymasv(msv);
    }

    @Override
        public Optional<Sinhviens> findbyid_sinhvien(Integer id_sinhvien) {
            return sinhviensRepository.findByUserId(id_sinhvien);
    }

  
}