package com.spring.bulkhead.playerstats.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 15/April/2021 By Author Eresh, Gorantla
 **/
@RestController
@RequestMapping("/api")
public class PlayerStatsController {

	@GetMapping("/player/{id}/stats")
	public ResponseEntity<String> getPlayerStats(@PathVariable Integer id) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		return ResponseEntity.ok("Data");
	}
}