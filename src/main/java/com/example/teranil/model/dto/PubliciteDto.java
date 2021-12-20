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
public class PubliciteDto {
    private Long id;
    private String name;
    @JsonIgnore
    private Collection<ImageDto> images=new ArrayList<>();
}
