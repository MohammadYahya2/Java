package com.example.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.savetravels.model.savetravelsmodel;
import com.example.savetravels.repository.SavaTravelsRepository;

@Service
public class SaveTravelsServices {
	private final SavaTravelsRepository savaTravelsRepository;
	
	public SaveTravelsServices(SavaTravelsRepository savaTravelsRepository) {
		this.savaTravelsRepository = savaTravelsRepository;
	}

	public List<savetravelsmodel> allSaveTravels() {
		return savaTravelsRepository.findAll();
	}


	public savetravelsmodel createSaveTravels(savetravelsmodel savetravels) {
		return savaTravelsRepository.save(savetravels);
	}

	public savetravelsmodel findSaveTravels(Long id) {
		Optional<savetravelsmodel> savetravels = savaTravelsRepository.findById(id);
		if (savetravels.isPresent()) {
			return savetravels.get();
		} else {
			return null;
		}
	}


	 public savetravelsmodel updateSaveTravels(savetravelsmodel savetravels) {
	        return  savaTravelsRepository.save(savetravels);
	      }

	public void deletesavetravel(Long id) {
		savaTravelsRepository.deleteById(id);
	}
}
