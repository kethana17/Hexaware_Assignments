package com.hexaware.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springproject.dto.PlayerDTO;
import com.hexaware.springproject.entity.Player;
import com.hexaware.springproject.service.IPlayerService;

import jakarta.validation.Valid;

	
@RestController
@RequestMapping("/api/v1/player")
public class PlayerRestController {
		
		
	@Autowired
	IPlayerService playerService;
		
		
	@PostMapping("/addPlayer")
	public Player addPlayer(@RequestBody @Valid PlayerDTO playerDTO) {
		return playerService.addPlayer(playerDTO);
			
	}
		
	@GetMapping("/getAllPlayer")
	public List<Player> getAllPlayer() {
		return playerService.getAllPlayer();
	}
	
	@GetMapping("/getallnames")
	public List<Player> findAllPlayerName()
	{
		return playerService.findAllPlayerByRole();
	}

}
