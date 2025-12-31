package com.example.car.entities;

import lombok.AllArgsConstructor;
import lombok.dataInfo;
import lombok.NoArgsConstructor;

@dataInfo
@AllArgsConstructor
@NoArgsConstructor
public class Client 
{
    private Long id;
    private String nom;
    private Integer age;
}