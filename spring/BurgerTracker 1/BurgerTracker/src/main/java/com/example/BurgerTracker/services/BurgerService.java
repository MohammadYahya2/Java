package com.example.BurgerTracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.BurgerTracker.models.Burger;
import com.example.BurgerTracker.repositories.BurgerRepositories;

@Service
public class BurgerService {
	private final BurgerRepositories burgerRepositories;

	public BurgerService(BurgerRepositories burgerRepositories) {
		this.burgerRepositories = burgerRepositories;
	}

	public List<Burger> allBurger() {
		return burgerRepositories.findAll();
	}


	public Burger createBurger(Burger burger) {
		return burgerRepositories.save(burger);
	}

	public Burger findBurger(Long id) {
		Optional<Burger> burger = burgerRepositories.findById(id);
		if (burger.isPresent()) {
			return burger.get();
		} else {
			return null;
		}
	}


	public Burger updateBurger(Long id, String Burgername, String Restaurantname, Integer Rating, String noting) {
		Burger updateBurger = findBurger(id);
		updateBurger.setBurgerName(Burgername);
		updateBurger.setRestaurantname(Restaurantname);
		updateBurger.setRating(Rating);
		updateBurger.setNoting(noting);
		return burgerRepositories.save(updateBurger);
	}

	public void deleteBurger(Long id) {
		burgerRepositories.deleteById(id);
	}
}
