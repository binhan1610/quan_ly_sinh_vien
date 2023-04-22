package com.example.demodo.rest;

import com.example.demodo.dto.SinhviensDTO;
import com.example.demodo.entity.Sinhviens;
import com.example.demodo.entity.Users;
import com.example.demodo.service.SinhviensService;
import com.example.demodo.service.UsersService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("")
public class SinhviensController {

    @Autowired
    private SinhviensService sinhviensService;
    @Autowired
    private UsersService usersService;

    // them sv
    @PostMapping(value = "/sinhvien")
    public ResponseEntity<Integer> createSinhVien(@RequestBody Map<String, Object> body) {
        Map<String, String> res = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        Sinhviens sinhVien = objectMapper.convertValue(body.get("sinhviens"), Sinhviens.class);
        Users users = objectMapper.convertValue(body.get("users"), Users.class);

        Optional<Sinhviens> sv2 = sinhviensService.findSvMsv(sinhVien.getMasv().toUpperCase());
        if (sv2.isPresent()) {
            res.put("message", "da ton tai sv");
            return ResponseEntity.ok().body(-1);

        } else {
            usersService.save(users);

            System.out.println("Receive Sinh vien");
            System.out.println(sinhVien);
            // users.setUsername(chuanHoa(users.getHoten()));
            users.setPassword("1");
            sinhVien.setUserId(users.getId());
            ;
            sinhVien.setMasv(sinhVien.getMasv().toUpperCase());
            sinhviensService.save(sinhVien);
            System.out.println("saved SV");
            res.put("message", "them sinh vien thanh cong");
            return ResponseEntity.status(HttpStatus.CREATED).body(users.getId());

        }

    }

    @PutMapping(value = "/sinhvien")
    public String updatesinhvien(@RequestParam("id") Integer id, @RequestParam("hoten") String hoten,
            @RequestParam("email") String email, @RequestParam("sdt") String sdt,
            @RequestParam("gioitinh") String gioitinh,
            @RequestParam("ngaysinh") String ngaysinh, @RequestParam("diachi") String diachi,
            @RequestParam("khoa") String khoa, @RequestParam("masv") String masv,
            @RequestParam("lopcq") String lopcq) {

        Optional<Sinhviens> sv2 = sinhviensService.find(id);
        if (sv2.isPresent()) {
            Sinhviens sv = sv2.get();
            Users users = usersService.find(sv.getUserId()).get();
            users.setEmail(email);
            users.setHoten(hoten);
            users.setNgaysinh(ngaysinh);
            users.setSdt(sdt);
            users.setDiachi(diachi);
            users.setGioitinh(gioitinh);
            usersService.save(users);
            String msv = masv.toUpperCase();
            Optional<Sinhviens> svs = sinhviensService.findSvMsv(msv);
            if (msv.equals(sv.getMasv()))
                return "ok";
            if (svs.isPresent())
                return "trùng mã sv";
            sv.setMasv(msv);
            sv.setKhoa(khoa);
            sv.setLopcq(lopcq);
            sinhviensService.save(sv);

        }
        return "ok";
    }

    @GetMapping("/listSV")
    public ResponseEntity<List<SinhviensDTO>> getALLsv() {
        List<Sinhviens> sinhvienslist = sinhviensService.findAll();
        List<SinhviensDTO> sinhviensDTOs = new ArrayList<>();
        for (Sinhviens i : sinhvienslist) {
            Users users = usersService.find(i.getUserId()).get();
            sinhviensDTOs.add(new SinhviensDTO(i, users));

        }
        return ResponseEntity.ok().body(sinhviensDTOs);
    }

    // xoa sv
    @DeleteMapping("/sinhvien/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id) {
        Sinhviens sinhviens = sinhviensService.find(id).get();
        Users user = usersService.find(sinhviens.getUserId()).get();
        sinhviensService.delete(id);
        usersService.delete(user.getId());

    }

    @PostMapping("/sinhviens")
    public Sinhviens save(@RequestBody Sinhviens sinhviens) {
        return sinhviensService.save(sinhviens);
    }

    @GetMapping("/sinhviens/{id}")
    public Optional<Sinhviens> getById(@PathVariable(value = "id") Integer id) {
        return sinhviensService.find(id);
    }

    @GetMapping("/sinhviens/count")
    public long count() {
        return sinhviensService.count();
    }
}