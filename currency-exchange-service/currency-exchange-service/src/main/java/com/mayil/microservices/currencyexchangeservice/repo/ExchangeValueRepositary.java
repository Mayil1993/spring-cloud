package com.mayil.microservices.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mayil.microservices.currencyexchangeservice.beans.ExchangeValue;

@Repository
public interface ExchangeValueRepositary extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
}
