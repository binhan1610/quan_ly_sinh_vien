
package com.example.demodo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lophps")
public class Lophps {
  @Id
  @Column(name = "id")
  private Integer id;

  @Column(name = "ki hoc")
  private Integer kihoc;

  @Column(name = "mahp")
  private String mahp;

  @Column(name = "namhoc")
  private Integer namhoc;

  @Column(name = "siso")
  private Integer siso;

  @Column(name = "ten")
  private String ten;

  @Column(name = "monhoc_id")
  private Integer monhocId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getKihoc() {
    return kihoc;
  }

  public void setKihoc(Integer kihoc) {
    this.kihoc = kihoc;
  }

  public String getMahp() {
    return mahp;
  }

  public void setMahp(String mahp) {
    this.mahp = mahp;
  }

  public Integer getNamhoc() {
    return namhoc;
  }

  public void setNamhoc(Integer namhoc) {
    this.namhoc = namhoc;
  }

  public Integer getSiso() {
    return siso;
  }

  public void setSiso(Integer siso) {
    this.siso = siso;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public Integer getMonhocId() {
    return monhocId;
  }

  public void setMonhocId(Integer monhocId) {
    this.monhocId = monhocId;
  }
}
