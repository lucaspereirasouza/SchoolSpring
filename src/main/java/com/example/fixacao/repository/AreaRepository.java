package com.example.fixacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fixacao.model.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {

}
