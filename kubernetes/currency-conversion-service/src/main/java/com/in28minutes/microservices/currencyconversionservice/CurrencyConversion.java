package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversion {
	private BigDecimal totalCalculatedAmount;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private String environment;
	private String from;
	private String to;
	private Long id;

	public CurrencyConversion() {
	}
	
	public CurrencyConversion(Long id, String from, String to, BigDecimal quantity,
							  BigDecimal conversionMultiple, BigDecimal totalCalculatedAmount, String environment) {
		super();
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.conversionMultiple = conversionMultiple;
		this.environment = environment;
		this.quantity = quantity;
		this.from = from;
		this.id = id;
		this.to = to;
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

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	

}
