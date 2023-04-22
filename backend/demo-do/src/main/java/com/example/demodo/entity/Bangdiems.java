
package com.example.demodo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bangdiems")
public class Bangdiems {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "diembt")
    private Float diembt;

    @Column(name = "diemcc")
    private Float diemcc;

    @Column(name = "diemck")
    private Float diemck;

    @Column(name = "diemkt")
    private Float diemkt;

    @Column(name = "diemth")
    private Float diemth;

    @Column(name = "diemtk10")
    private Float diemtk10;

    @Column(name = "diemtk4")
    private String diemtk4;

    @Column(name = "lophps_id")
    private Integer lophpId;

    @Column(name = "sinhviens_id")
    private Integer sinhvienId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getDiembt() {
        return this.diembt;
    }

    public void setDiembt(Float diembt) {
        this.diembt = diembt;
    }

    public Float getDiemcc() {
        return this.diemcc;
    }

    public void setDiemcc(Float diemcc) {
        this.diemcc = diemcc;
    }

    public Float getDiemck() {
        return this.diemck;
    }

    public void setDiemck(Float diemck) {
        this.diemck = diemck;
    }

    public Float getDiemkt() {
        return this.diemkt;
    }

    public void setDiemkt(Float diemkt) {
        this.diemkt = diemkt;
    }

    public Float getDiemth() {
        return this.diemth;
    }

    public void setDiemth(Float diemth) {
        this.diemth = diemth;
    }

    public Float getDiemtk10() {
        return this.diemtk10;
    }

    public void setDiemtk10(Float diemtk10) {
        this.diemtk10 = diemtk10;
    }

    public String getDiemtk4() {
        return this.diemtk4;
    }

    public void setDiemtk4(String diemtk4) {
        this.diemtk4 = diemtk4;
    }

    public Integer getLophpId() {
        return this.lophpId;
    }

    public void setLophpId(Integer lophpId) {
        this.lophpId = lophpId;
    }

    public Integer getSinhvienId() {
        return this.sinhvienId;
    }

    public void setSinhvienId(Integer sinhvienId) {
        this.sinhvienId = sinhvienId;
    }

}
