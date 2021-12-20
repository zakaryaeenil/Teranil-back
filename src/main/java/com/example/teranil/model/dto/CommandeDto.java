package com.example.teranil.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommandeDto {
    private Long id;
    private String name;
    private String code;
    private CodePromoDto codePromo;
    private UserDto user;



}
