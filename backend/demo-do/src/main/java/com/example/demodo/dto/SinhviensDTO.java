package com.example.demodo.dto;

import com.example.demodo.entity.Sinhviens;
import com.example.demodo.entity.Users;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class SinhviensDTO {
  private Sinhviens sinhviens;
  private Users Users;
}
