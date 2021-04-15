package com.spring.bulkhead.player.service;

import com.spring.bulkhead.player.vo.PlayerVO;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 15/April/2021 By Author Eresh, Gorantla
 **/
@Service
@RequiredArgsConstructor
public class PlayerService {

	private List<PlayerVO> players;
	private final PlayerStatsClientService playerStatsClientService;

	@PostConstruct
	public void init() {
		players = new ArrayList<>();
		players.add(new PlayerVO(1, "Player1", "Cricket", "India", 30));
		players.add(new PlayerVO(2, "Player2", "Soccer", "Britan", 32));
		players.add(new PlayerVO(3, "Player3", "Shooting", "Australia", 25));
		players.add(new PlayerVO(1, "Player1", "Cricket", "India", 30));
		players.add(new PlayerVO(1, "Player1", "Cricket", "India", 30));
	}

	public List<PlayerVO> getPlayers() {
		return players;
	}

	public String getPlayerStats(Integer playerId) {
		return playerStatsClientService.getProductRatingDto(playerId);
	}
}