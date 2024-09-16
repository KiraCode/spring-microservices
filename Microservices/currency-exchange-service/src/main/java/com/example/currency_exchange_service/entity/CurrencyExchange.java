package com.example.currency_exchange_service.entity;

import java.math.BigDecimal;

public class CurrencyExchange {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiply;

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

}
