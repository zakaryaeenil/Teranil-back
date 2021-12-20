package com.example.teranil.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceDto {
    private Long id;
    private String name;
    private String adress;
    private Collection<ServiceDto> services = new ArrayList<>();
    private Collection<BoxDto> boxes = new ArrayList<>();
    private Collection<PubliciteDto> publicites = new ArrayList<>();

}
