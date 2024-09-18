package com.example.currency_conversion_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.currency_conversion_service.entity.CurrencyConversion;

//@FeignClient(name = "currency-exchange", url = "localhost:8000")

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangevalue(@PathVariable String from, @PathVariable String to);

}
