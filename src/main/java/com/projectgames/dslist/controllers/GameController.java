package com.projectgames.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectgames.dslist.DTO.GameMinDTO;
import com.projectgames.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	
	@Autowired
	private GamesService gamesService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gamesService.findAll();
			return result;
	}
}
