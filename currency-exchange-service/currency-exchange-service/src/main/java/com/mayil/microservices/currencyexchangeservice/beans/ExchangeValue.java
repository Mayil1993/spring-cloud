package com.mayil.microservices.currencyexchangeservice.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExchangeValue {

	@Id
	@Getter@Setter private Long id;
	
	@Column(name="currency_from")
	@Getter@Setter private String from;
	
	@Column(name="currency_to")
	@Getter@Setter private String to;
	@Getter@Setter private BigDecimal conversionMultiple;
	@Getter@Setter private int port;
	
}
