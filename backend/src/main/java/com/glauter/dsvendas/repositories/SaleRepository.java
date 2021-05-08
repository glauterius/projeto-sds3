package com.glauter.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glauter.dsvendas.entity.SaleEntity;

public interface SaleRepository extends JpaRepository<SaleEntity, Long>{

}