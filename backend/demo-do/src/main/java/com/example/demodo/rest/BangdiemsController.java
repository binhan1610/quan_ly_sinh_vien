package com.example.demodo.rest;

import com.example.demodo.dto.BangdiemsDTO;
import com.example.demodo.entity.Bangdiems;
import com.example.demodo.entity.Lophps;
import com.example.demodo.entity.Sinhviens;
import com.example.demodo.entity.Users;
import com.example.demodo.service.BangdiemsService;
import com.example.demodo.service.LophpsService;
import com.example.demodo.service.SinhviensService;
import com.example.demodo.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("")
public class BangdiemsController {

    @Autowired
    private BangdiemsService bangdiemsService;

    @Autowired
    private UsersService usersService;
    @Autowired
    private SinhviensService sinhviensService;

    @Autowired
    private LophpsService lophpsService;

    @GetMapping("/diembysv")
    public List<BangdiemsDTO> getBangDiemByIdSV(@CookieValue(value = "user_id") String id) {
        Integer iid = Integer.parseInt(id);

        Sinhviens sinhviens = sinhviensService.findbyid_sinhvien(iid).get();
        Users user = usersService.find(iid).get();
        return bangdiemsService.findListBangDiemByIDSv(sinhviens.getId());

    }

    @GetMapping("/diembysv/{id}")
    public List<BangdiemsDTO> getBangDiemByIdSV(@PathVariable(value = "id") Integer id) {
        Integer iid = id;

        Sinhviens sinhviens = sinhviensService.findbyid_sinhvien(iid).get();
        Users user = usersService.find(iid).get();
        return bangdiemsService.findListBangDiemByIDSv(sinhviens.getId());
    }

    @GetMapping("diembyLop/{id}")
    public Map<String, List<BangdiemsDTO>> getBangDiemByidlophp(@PathVariable(value = "id") Integer id) {
        Map res = new HashMap<>();
        Lophps lophps = lophpsService.find(id).get();
        res.put(lophps.getTen(), bangdiemsService.findListBangDiemByIDLophp(id));

        return res;
    }

}