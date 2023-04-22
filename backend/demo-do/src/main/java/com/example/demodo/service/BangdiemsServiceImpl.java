package com.example.demodo.service;

import com.example.demodo.dto.BangdiemsDTO;
import com.example.demodo.entity.Bangdiems;
import com.example.demodo.entity.Lophps;
import com.example.demodo.entity.Monhocs;
import com.example.demodo.entity.Sinhviens;
import com.example.demodo.entity.Users;
import com.example.demodo.repository.BangdiemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BangdiemsServiceImpl implements BangdiemsService {

    @Autowired
    private BangdiemsRepository bangdiemsRepository;
    @Autowired
    private LophpsService _lophpsService;
    @Autowired
    private MonhocsService _mhService;

    @Autowired
    private UsersService usersService;

    @Autowired
    private SinhviensService sinhviensService;

    public Bangdiems save(Bangdiems bangdiems) {
        return bangdiemsRepository.save(bangdiems);
    }

    @Override
    public Optional<Bangdiems> find(Integer id) {
        return bangdiemsRepository.findById(id);
    }

    @Override
    public List<Bangdiems> findAll() {
        return bangdiemsRepository.findAll();
    }

    @Override
    public List<Bangdiems> findAll(Sort sort) {
        return bangdiemsRepository.findAll(sort);
    }

    @Override
    public Page<Bangdiems> findAll(Pageable pageable) {
        return bangdiemsRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
        bangdiemsRepository.deleteById(id);
    }

    @Override
    public void delete(Bangdiems bangdiems) {
        bangdiemsRepository.delete(bangdiems);
    }

    @Override
    public void deleteAll() {
        bangdiemsRepository.deleteAll();
    }

    @Override
    public List<BangdiemsDTO> findListBangDiemByIDSv(Integer id) {
        List<Bangdiems> bangdiems = bangdiemsRepository.find_diem_by_idsv(id);
        List<BangdiemsDTO> bangdiemsDTO = new ArrayList<>();

        for (Bangdiems i : bangdiems) {
            Lophps lophps = _lophpsService.find(i.getLophpId()).get();
            bangdiemsDTO.add(new BangdiemsDTO(" ",
                    i.getDiembt(), i.getDiemcc(), i.getDiemck(),
                    i.getDiemkt(), i.getDiemth(), i.getDiemtk10(), i.getDiemtk4(), lophps.getTen()));
        }

        return bangdiemsDTO;

    }

    @Override
    public List<BangdiemsDTO> findListBangDiemByIDLophp(Integer id) {
        List<Bangdiems> bangdiems = bangdiemsRepository.find_diem_by_idlophp(id);
        List<BangdiemsDTO> bangdiemsDTO = new ArrayList<>();

        for (Bangdiems i : bangdiems) {
            Integer idsinhvien = i.getSinhvienId();
            Sinhviens sinhviens = sinhviensService.find(idsinhvien).get();
            Integer idsv = sinhviens.getUserId();
            Users user = usersService.find(idsv).get();
            bangdiemsDTO.add(new BangdiemsDTO(user.getHoten(),
                    i.getDiembt(), i.getDiemcc(), i.getDiemck(),
                    i.getDiemkt(), i.getDiemth(), i.getDiemtk10(), i.getDiemtk4(), " "));
        }

        return bangdiemsDTO;

    }

}