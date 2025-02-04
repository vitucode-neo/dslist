package com.projectgames.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectgames.dslist.DTO.GameDTO;
import com.projectgames.dslist.DTO.GameMinDTO;
import com.projectgames.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	
	@Autowired
	private GamesService gamesService;
	
	
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gamesService.findById(id);
			return result;
	}
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gamesService.findAll();
			return result;
	}
}
