
package com.example.demodo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cauhinh_diems")
public class CauhinhDiems {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "diembt")
    private Integer diembt;

    @Column(name = "diemcc")
    private Integer diemcc;

    @Column(name = "diemck")
    private Integer diemck;

    @Column(name = "diemkt")
    private Integer diemkt;

    @Column(name = "diemth")
    private Integer diemth;

    @Column(name = "monhoc_id")
    private Integer monhocid;

    @Column(name = "ngay_bat_dau")
    private String ngaybatdau;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiembt() {
        return this.diembt;
    }

    public void setDiembt(Integer diembt) {
        this.diembt = diembt;
    }

    public Integer getDiemcc() {
        return this.diemcc;
    }

    public void setDiemcc(Integer diemcc) {
        this.diemcc = diemcc;
    }

    public Integer getDiemck() {
        return this.diemck;
    }

    public void setDiemck(Integer diemck) {
        this.diemck = diemck;
    }

    public Integer getDiemkt() {
        return this.diemkt;
    }

    public void setDiemkt(Integer diemkt) {
        this.diemkt = diemkt;
    }

    public Integer getDiemth() {
        return this.diemth;
    }

    public void setDiemth(Integer diemth) {
        this.diemth = diemth;
    }

    public Integer getmonhocid() {
        return this.monhocid;
    }

    public void setmonhocid(Integer monhocid) {
        this.monhocid = monhocid;
    }

    public String getngaybatdau() {
        return this.ngaybatdau;
    }

    public void setngaybatdau(String ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }
}
