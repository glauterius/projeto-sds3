package com.glauter.dsvendas.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_sales")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SaleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private SellerEntity seller;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerEntity getSeller() {
		return seller;
	}

	public void setSeller(SellerEntity seller) {
		this.seller = seller;
	}
	
	
}
