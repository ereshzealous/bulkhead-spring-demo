package com.spring.bulkhead.player.service;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * Created on 15/April/2021 By Author Eresh, Gorantla
 **/
@Service
public class PlayerStatsClientService {
	private final RestTemplate restTemplate = new RestTemplate();

	@Value("${stats.service.endpoint}")
	private String statsService;

	@Bulkhead(name = "statsService", fallbackMethod = "getDefaultStats")
	public String getProductRatingDto(int playerId){
		return this.restTemplate.getForEntity(this.statsService, String.class, playerId)
		                        .getBody();
	}

	public String getDefaultStats(int playerId, Throwable throwable){
		return "Default";
	}
}