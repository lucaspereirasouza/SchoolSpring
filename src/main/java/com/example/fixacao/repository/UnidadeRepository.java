package com.example.fixacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fixacao.model.Unidade;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Integer>{
	
}
