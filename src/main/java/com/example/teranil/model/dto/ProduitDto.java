package com.example.teranil.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitDto {
    private Long id;
    private String name;
    private Float kg;
    private Float piece;
    private Float price;
    private Float discount;
    @JsonIgnore
    private Collection<CategoryDto> categories = new ArrayList<>();
    @JsonIgnore
    private Collection<CommandeDto> commandes = new ArrayList<>();
    private ServiceDto service;
}
