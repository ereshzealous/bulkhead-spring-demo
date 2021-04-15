package com.spring.bulkhead.player.controller;

import com.spring.bulkhead.player.service.PlayerService;
import com.spring.bulkhead.player.vo.PlayerVO;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 15/April/2021 By Author Eresh, Gorantla
 **/
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PlayerController {

	private final PlayerService playerService;

	@GetMapping("/players")
	public ResponseEntity<List<PlayerVO>> getPlayers() {
		return ResponseEntity.ok(playerService.getPlayers());
	}

	@GetMapping("/player/{id}/stats")
	public ResponseEntity<String> getStats(@PathVariable Integer id) {
		return ResponseEntity.ok(playerService.getPlayerStats(id));
	}
}