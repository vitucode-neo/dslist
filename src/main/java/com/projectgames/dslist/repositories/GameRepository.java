package com.projectgames.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectgames.dslist.entities.Games;

public interface GameRepository  extends JpaRepository<Games, Long> {

}
