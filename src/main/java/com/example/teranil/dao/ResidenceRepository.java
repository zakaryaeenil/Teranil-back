package com.example.teranil.dao;

import com.example.teranil.model.Residance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ResidenceRepository extends JpaRepository<Residance,Long> {
}
