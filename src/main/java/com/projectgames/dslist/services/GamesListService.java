package com.projectgames.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectgames.dslist.DTO.GameListDTO;
import com.projectgames.dslist.entities.GameList;
import com.projectgames.dslist.repositories.GameListRepository;




@Service
public class GamesListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	
}
