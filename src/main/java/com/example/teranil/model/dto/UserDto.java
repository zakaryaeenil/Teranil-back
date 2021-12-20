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
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String address;
    private String telephone;
    private Boolean enabled=true;
    @JsonIgnore
    private Collection<RoleDto> roles = new ArrayList<>();
    private PackDto pack;
    @JsonIgnore
    private Collection<CommandeDto> commandes=new ArrayList<>();

}
