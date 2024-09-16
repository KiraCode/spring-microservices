package com.example.currency_exchange_service.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.currency_exchange_service.entity.CurrencyExchange;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		String port = environment.getProperty("local.server.port");
		CurrencyExchange exchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
		exchange.setEnvironment(port);
		return exchange;
	}
}
