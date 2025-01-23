package com.projectgames.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectgames.dslist.DTO.GameListDTO;
import com.projectgames.dslist.DTO.GameMinDTO;
import com.projectgames.dslist.services.GamesListService;
import com.projectgames.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	
	@Autowired
	private GamesListService gamesListService;
	
	@Autowired
	private GamesService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gamesListService.findAll();
			return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
			return result;
	}
}
