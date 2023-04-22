package com.example.demodo.service;

import com.example.demodo.entity.Admins;
import com.example.demodo.repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class AdminsServiceImpl implements AdminsService {

    @Autowired
    private AdminsRepository adminsRepository;

    @Override
    public Admins save(Admins admins) {
        return adminsRepository.save(admins);
    }

    @Override
    public Optional<Admins> find(Integer id) {
        return adminsRepository.findById(id);
    }

    @Override
    public List<Admins> findAll() {
        return adminsRepository.findAll();
    }

    @Override
    public List<Admins> findAll(Sort sort){
        return adminsRepository.findAll(sort);
    }

    @Override
    public Page<Admins> findAll(Pageable pageable){
        return adminsRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
    adminsRepository.deleteById(id);
    }

    @Override
    public void delete(Admins admins) {
        adminsRepository.delete(admins);
    }

    @Override
    public void deleteAll() {
        adminsRepository.deleteAll();
    }

    @Override
    public long count() {
        return adminsRepository.count();
    }

}