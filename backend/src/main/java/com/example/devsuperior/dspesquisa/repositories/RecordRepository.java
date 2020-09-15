package com.example.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.devsuperior.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
	
	

}
