package com.glauter.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glauter.dsvendas.dto.SaleDTO;
import com.glauter.dsvendas.dto.SaleSuccessDTO;
import com.glauter.dsvendas.dto.SaleSumDTO;
import com.glauter.dsvendas.entity.SaleEntity;
import com.glauter.dsvendas.repositories.SaleRepository;
import com.glauter.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<SaleEntity> result = saleRepository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller() {
		return saleRepository.amountGroupBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupBySeller() {
		return saleRepository.successGroupBySeller();
	}
}
