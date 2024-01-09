package com.example.BurgerTracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BurgerTracker.models.Burger;

@Repository
public interface BurgerRepositories extends CrudRepository<Burger, Long> {

	List<Burger> findAll();
//
//	List<Burger> findByNotingContaining(String keyword);
//
//	Long countByburgerNameContaining(String search);
//
//	Long deleteByburgerNameStartingWith(String search);
}

