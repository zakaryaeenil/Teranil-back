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
public class PackDto {
    private Long id;
    private String name;
    private String description;
    @JsonIgnore
    private Collection<UserDto> users = new ArrayList<>();
    @JsonIgnore
    private Collection<ProduitDto> produits = new ArrayList<>();
}
