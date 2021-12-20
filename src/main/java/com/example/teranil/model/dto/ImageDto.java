package com.example.teranil.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageDto {
    private Long id;
    private String path;
    private PubliciteDto publicite;

}
