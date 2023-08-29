package com.example.fixacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fixacao.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
