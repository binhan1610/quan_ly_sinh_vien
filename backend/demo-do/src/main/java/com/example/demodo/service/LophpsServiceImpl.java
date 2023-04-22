package com.example.demodo.service;

import com.example.demodo.entity.Lophps;
import com.example.demodo.repository.LophpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class LophpsServiceImpl implements LophpsService {

    @Autowired
    private LophpsRepository lophpsRepository;

    @Override
    public Lophps save(Lophps lophps) {
        return lophpsRepository.save(lophps);
    }

    @Override
    public Optional<Lophps> find(Integer id) {
        return lophpsRepository.findById(id);
    }

    @Override
    public List<Lophps> findAll() {
        return lophpsRepository.findAll();
    }

    @Override
    public List<Lophps> findAll(Sort sort){
        return lophpsRepository.findAll(sort);
    }

    @Override
    public Page<Lophps> findAll(Pageable pageable){
        return lophpsRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
    lophpsRepository.deleteById(id);
    }

    @Override
    public void delete(Lophps lophps) {
        lophpsRepository.delete(lophps);
    }

    @Override
    public void deleteAll() {
        lophpsRepository.deleteAll();
    }


   

    @Override
    public long count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public String findtenmonhocByidlophp(Integer lophpId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findtenmonhocByidlophp'");
    }


  
}