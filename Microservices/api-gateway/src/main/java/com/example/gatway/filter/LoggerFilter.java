package com.example.gatway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class LoggerFilter implements GlobalFilter {

	private Logger logger = LoggerFactory.getLogger(LoggerFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("Path of the request received -> {} " + exchange.getRequest().getPath());
		return chain.filter(exchange);
	}

}
