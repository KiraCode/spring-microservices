package com.example.currency_exchange_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.currency_exchange_service.entity.CurrencyExchange;

@Repository
public interface CurrencyValueRepository extends JpaRepository<CurrencyExchange, Long>{
	public CurrencyExchange findByFromAndTo(String from, String to);
}
