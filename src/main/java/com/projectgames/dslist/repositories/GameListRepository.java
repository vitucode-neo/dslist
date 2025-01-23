package com.projectgames.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectgames.dslist.entities.GameList;

public interface GameListRepository  extends JpaRepository<GameList, Long> {
	
	

}
