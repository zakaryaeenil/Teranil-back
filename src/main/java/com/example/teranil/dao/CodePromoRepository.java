package com.example.teranil.dao;

import com.example.teranil.model.CodePromo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CodePromoRepository extends JpaRepository<CodePromo, Long> {
}
