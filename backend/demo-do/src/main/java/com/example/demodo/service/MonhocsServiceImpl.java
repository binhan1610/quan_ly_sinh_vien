package com.example.demodo.service;

import com.example.demodo.entity.Monhocs;
import com.example.demodo.repository.MonhocsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class MonhocsServiceImpl implements MonhocsService {

    @Autowired
    private MonhocsRepository monhocsRepository;

    @Override
    public Monhocs save(Monhocs monhocs) {
        return monhocsRepository.save(monhocs);
    }

    @Override
    public Optional<Monhocs> find(Integer id) {
        return monhocsRepository.findById(id);
    }

    @Override
    public List<Monhocs> findAll() {
        return monhocsRepository.findAll();
    }

    @Override
    public List<Monhocs> findAll(Sort sort){
        return monhocsRepository.findAll(sort);
    }

    @Override
    public Page<Monhocs> findAll(Pageable pageable){
        return monhocsRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
    monhocsRepository.deleteById(id);
    }

    @Override
    public void delete(Monhocs monhocs) {
        monhocsRepository.delete(monhocs);
    }

    @Override
    public void deleteAll() {
        monhocsRepository.deleteAll();
    }



    @Override
    public Monhocs getMHByIDMonHoc(Integer idMonHoc) {
        return monhocsRepository.findById(idMonHoc).get();
    }

}