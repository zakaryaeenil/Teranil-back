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
public class ServiceDto {
    private Long id;
    private String name;
    private String description;
    @JsonIgnore
    private Collection<CategoryDto> categories=new ArrayList<>();
    @JsonIgnore
    private Collection<ProduitDto> produits=new ArrayList<>();

}
