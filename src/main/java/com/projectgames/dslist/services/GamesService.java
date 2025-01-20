package com.projectgames.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectgames.dslist.DTO.GameMinDTO;
import com.projectgames.dslist.entities.Games;
import com.projectgames.dslist.repositories.GameRepository;

@Service
public class GamesService {
	
	@Autowired
	private GameRepository gameRepository;
	 
	public List<GameMinDTO> findAll() {
		List<Games> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
		
	}
}
