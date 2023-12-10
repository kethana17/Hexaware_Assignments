package com.hexaware.springproject.service;

import java.util.List;
import com.hexaware.springproject.dto.PlayerDTO;
import com.hexaware.springproject.entity.Player;

public interface IPlayerService {
	
	public List<Player> getAllPlayer();
	public Player addPlayer(PlayerDTO playerDTO);
	public List<Player> findAllPlayerByRole();
	

}