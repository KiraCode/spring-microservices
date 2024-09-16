package com.example.currency_exchange_service.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchange {

	@Id
	private Long id;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;
	
	@Column(name = "conversion_multiple")
	private BigDecimal conversionMultiply;
	private String environment;

	public CurrencyExchange() {
		
	}

	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiply) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiply = conversionMultiply;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiply() {
		return conversionMultiply;
	}

	public void setConversionMultiply(BigDecimal conversionMultiply) {
		this.conversionMultiply = conversionMultiply;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
