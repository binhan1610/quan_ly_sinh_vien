package com.example.demodo.service;

import com.example.demodo.entity.CauhinhDiems;
import com.example.demodo.repository.CauhinhDiemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class CauhinhDiemsServiceImpl implements CauhinhDiemsService {

    @Autowired
    private CauhinhDiemsRepository cauhinhdiemsRepository;

    @Override
    public CauhinhDiems save(CauhinhDiems cauhinhdiems) {
        return cauhinhdiemsRepository.save(cauhinhdiems);
    }

    @Override
    public Optional<CauhinhDiems> find(Integer id) {
        return cauhinhdiemsRepository.findById(id);
    }

    @Override
    public List<CauhinhDiems> findAll() {
        return cauhinhdiemsRepository.findAll();
    }

    @Override
    public List<CauhinhDiems> findAll(Sort sort){
        return cauhinhdiemsRepository.findAll(sort);
    }

    @Override
    public Page<CauhinhDiems> findAll(Pageable pageable){
        return cauhinhdiemsRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
    cauhinhdiemsRepository.deleteById(id);
    }

    @Override
    public void delete(CauhinhDiems cauhinhdiems) {
        cauhinhdiemsRepository.delete(cauhinhdiems);
    }

    @Override
    public void deleteAll() {
        cauhinhdiemsRepository.deleteAll();
    }

    @Override
    public long count() {
        return cauhinhdiemsRepository.count();
    }

}