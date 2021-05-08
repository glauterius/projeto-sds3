package com.glauter.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.glauter.dsvendas.dto.SaleSuccessDTO;
import com.glauter.dsvendas.dto.SaleSumDTO;
import com.glauter.dsvendas.entity.SaleEntity;

public interface SaleRepository extends JpaRepository<SaleEntity, Long>{
	
	@Query("SELECT new com.glauter.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM SaleEntity AS obj GROUP BY obj.seller")
		List<SaleSumDTO> amountGroupBySeller();
	
	@Query("SELECT new com.glauter.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM SaleEntity AS obj GROUP BY obj.seller")
		List<SaleSuccessDTO> successGroupBySeller();
}