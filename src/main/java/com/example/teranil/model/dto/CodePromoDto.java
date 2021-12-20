package com.example.teranil.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodePromoDto {
    private Long id;
    private String name;
    private String code;
    @JsonIgnore
    private Collection<CommandeDto> commandes=new ArrayList<>();
}
