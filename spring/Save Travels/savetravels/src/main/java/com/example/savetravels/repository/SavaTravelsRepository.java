package com.example.savetravels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.savetravels.model.savetravelsmodel;

public interface SavaTravelsRepository extends CrudRepository<savetravelsmodel, Long>{
	List<savetravelsmodel> findAll();

//	List<savetravelsmodel> findByNotingContaining(String keyword);
//
//	Long countByburgerNameContaining(String search);
//
//	Long deleteByburgerNameStartingWith(String search);
}
