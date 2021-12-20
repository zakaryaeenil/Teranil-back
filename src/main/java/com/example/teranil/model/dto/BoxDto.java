package com.example.teranil.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoxDto {
    private Long id;
    private String name;
    private Boolean isopen;
    private ResidenceDto residance;
}
