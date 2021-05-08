package com.glauter.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glauter.dsvendas.dto.SellerDTO;
import com.glauter.dsvendas.entity.SellerEntity;
import com.glauter.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll() {
		List<SellerEntity> result = sellerRepository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
