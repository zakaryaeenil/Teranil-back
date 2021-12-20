package com.example.teranil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Residance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String adress;

    @ManyToMany
    private Collection<Service> services = new ArrayList<>();

    @ManyToMany
    private Collection<Box> boxes = new ArrayList<>();

    @ManyToMany
    private Collection<Publicite> publicites = new ArrayList<>();

}
