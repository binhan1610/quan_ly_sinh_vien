package com.example.demodo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "monhocs")
public class Monhocs {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "mamh")
    private String mamh;

    @Column(name = "sotc")
    private Integer sotc;

    @Column(name = "tenmh")
    private String tenmh;

    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    // Getter và Setter cho thuộc tính sotc
    public Integer getSotc() {
        return sotc;
    }

    public void setSotc(Integer sotc) {
        this.sotc = sotc;
    }

    // Getter và Setter cho thuộc tính tenmh
    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

}
