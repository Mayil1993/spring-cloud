package com.mayil.microservices.currencyconversionservice.bean;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConversionBean {
	
	@Getter@Setter private long id;
	@Getter@Setter private String from;
	@Getter@Setter private String to;
	@Getter@Setter private BigDecimal conversionMultiple;
	@Getter@Setter private BigDecimal quantity;
	@Getter@Setter private BigDecimal totalCalculatedAmount;
	@Getter@Setter private int port;
}
