
package com.example.demodo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sinhviens")
public class Sinhviens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "khoa")
    private String khoa;

    @Column(name = "lopcq")
    private String lopcq;

    @Column(name = "masv")
    private String masv;

    @Column(name = "user_id")
    private Integer userId;

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    // Getter và Setter cho thuộc tính lopcq
    public String getLopcq() {
        return lopcq;
    }

    public void setLopcq(String lopcq) {
        this.lopcq = lopcq;
    }

    // Getter và Setter cho thuộc tính masv
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    // Getter và Setter cho thuộc tính userId
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
