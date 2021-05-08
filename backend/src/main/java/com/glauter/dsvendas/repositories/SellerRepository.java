package com.glauter.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glauter.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}