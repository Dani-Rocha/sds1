package com.example.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.devsuperior.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
