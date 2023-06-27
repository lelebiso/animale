package it.pegaso2000.animale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pegaso2000.animale.model.Animale;
import it.pegaso2000.animale.repo.AnimaleRepo;

@Service
public class AnimaleServiceImplementation implements AnimaleService{

	private AnimaleRepo aRepo;

	@Autowired
	public AnimaleServiceImplementation(AnimaleRepo aRepo) {
		super();
		this.aRepo = aRepo;
	}
	
	@Override
		public boolean delete(int id) {
			Optional<Animale> a = aRepo.findById(id);
			if (a.isPresent()) {
				aRepo.deleteById(id);
				return true;
			}
			return false;
		}
	@Override
	public List<Animale> findAll() {
		return aRepo.findAll();
	}
	@Override
	public Animale findById(int id) {
		Optional<Animale> a = aRepo.findById(id);
		if (a.isPresent()) return a.get();
		return null;
	}
	@Override
	public Animale save(Animale animale) {
		return aRepo.save(animale);
	}
	
}
