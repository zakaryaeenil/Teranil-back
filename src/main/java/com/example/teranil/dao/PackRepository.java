package com.example.teranil.dao;


import com.example.teranil.model.Pack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PackRepository extends JpaRepository<Pack,Long> {
}
