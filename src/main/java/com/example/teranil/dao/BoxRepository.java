package com.example.teranil.dao;

import com.example.teranil.model.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BoxRepository extends JpaRepository<Box, Long> {

}
