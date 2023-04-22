package com.example.demodo.rest;

import com.example.demodo.entity.CauhinhDiems;
import com.example.demodo.service.CauhinhDiemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("")
public class CauhinhDiemsController {

    @Autowired
    private CauhinhDiemsService cauhinhdiemsService;

    @PostMapping("/cauhinhdiems")
    public CauhinhDiems save(@RequestBody CauhinhDiems cauhinhdiems) {
        return cauhinhdiemsService.save(cauhinhdiems);
    }

    @GetMapping("/cauhinhdiems/{id}")
    public Optional<CauhinhDiems> getById(@PathVariable(value = "id") Integer id) {
        return cauhinhdiemsService.find(id);
    }

    @GetMapping("/cauhinhdiems")
    public List<CauhinhDiems> getAll() {
        return cauhinhdiemsService.findAll();
    }

    @DeleteMapping("/cauhinhdiems/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id) {
        cauhinhdiemsService.delete(id);
    }

}