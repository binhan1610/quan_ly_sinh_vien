package com.example.demodo.dto;
public class MonhocsDTO {
    private Integer id;
    private String mamh;
    private Integer sotc;
    private String tenmh;
    private Integer cauhinhdiemId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMamh() {
        return this.mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    public Integer getSotc() {
        return this.sotc;
    }

    public void setSotc(Integer sotc) {
        this.sotc = sotc;
    }

    public String getTenmh() {
        return this.tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public Integer getCauhinhdiemId() {
        return this.cauhinhdiemId;
    }

    public void setCauhinhdiemId(Integer cauhinhdiemId) {
        this.cauhinhdiemId = cauhinhdiemId;
    }
}
