package com.hexaware.springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springproject.dto.PlayerDTO;
import com.hexaware.springproject.entity.Player;
import com.hexaware.springproject.repository.IPlayerRepository;

@Service
public class PlayerServiceImp implements IPlayerService {
	
	@Autowired
	IPlayerRepository playerRepository;

	@Override
	public Player addPlayer(PlayerDTO playerDTO) {
		// TODO Auto-generated method stub
		Player player=new Player();
		
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTotalMatches(playerDTO.getTotalMatches());
		player.setTeamName(playerDTO.getTeamName());
		player.setCountryName(playerDTO.getCountryName());
		player.setDescription(playerDTO.getDescription());
		
		
		return playerRepository.save(player);
		
	}

	@Override
	public List<Player> getAllPlayer() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

	@Override
	public List<Player> findAllPlayerByRole() {
		// TODO Auto-generated method stub
		return playerRepository.findAllPlayerByRole();
	}



}
