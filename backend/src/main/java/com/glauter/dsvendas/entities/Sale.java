package com.glauter.dsvendas.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer vidited;
	private Integer deals;
	private Double amount;
	private Date localDate;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	public Sale() {
		super();
	}
	
	public Sale(Long id, Integer vidited, Integer deals, Double amount, Date localDate, Seller seller) {
		this.id = id;
		this.vidited = vidited;
		this.deals = deals;
		this.amount = amount;
		this.localDate = localDate;
		this.seller = seller;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getVidited() {
		return vidited;
	}
	public void setVidited(Integer vidited) {
		this.vidited = vidited;
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
	public Date getLocalDate() {
		return localDate;
	}
	public void setLocalDate(Date localDate) {
		this.localDate = localDate;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
