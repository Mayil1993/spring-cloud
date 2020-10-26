package com.mayil.microservices.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mayil.microservices.currencyexchangeservice.beans.ExchangeValue;
import com.mayil.microservices.currencyexchangeservice.repo.ExchangeValueRepositary;import brave.sampler.Sampler;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class CurrencyExchangeController {

	@Autowired Environment environment;
	@Autowired ExchangeValueRepositary exchangeValueRepositary;
	
	@GetMapping("/currency-exchange/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		
		ExchangeValue exchangeValue = exchangeValueRepositary.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		log.info("{}->",exchangeValue);
		return exchangeValue;
	}
}
