package com.example.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.devsuperior.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
	
	

}
