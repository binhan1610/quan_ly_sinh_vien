package com.example.demodo.service;

import com.example.demodo.entity.Users;
import com.example.demodo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public Optional<Users> find(Integer id) {
        return usersRepository.findById(id);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public List<Users> findAll(Sort sort){
        return usersRepository.findAll(sort);
    }

    @Override
    public Page<Users> findAll(Pageable pageable){
        return usersRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
    usersRepository.deleteById(id);
    }

    @Override
    public void delete(Users users) {
        usersRepository.delete(users);
    }

    @Override
    public void deleteAll() {
        usersRepository.deleteAll();
    }

    @Override
    public long count() {
        return usersRepository.count();
    }

    @Override
    public Users login(String username, String password) {
        return usersRepository.findByUsernameAndPassword(username, password);
    }

}