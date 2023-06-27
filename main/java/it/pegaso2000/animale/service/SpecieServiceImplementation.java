package it.pegaso2000.animale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pegaso2000.animale.model.Specie;
import it.pegaso2000.animale.repo.SpecieRepo;

@Service
public class SpecieServiceImplementation implements SpecieService {

	private SpecieRepo sRepo;

	@Autowired
	public SpecieServiceImplementation(SpecieRepo sRepo) {
		super();
		this.sRepo = sRepo;
	}

	@Override
	public boolean delete(int id) {
		Optional<Specie> s = sRepo.findById(id);
		if (s.isPresent()) {
			sRepo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Specie> findAll() {
		return sRepo.findAll();
	}

	@Override
	public Specie findById(int id) {
		Optional<Specie> s = sRepo.findById(id);
		if (s.isPresent())
			return s.get();
		return null;
	}

	@Override
	public Specie save(Specie specie) {
		return sRepo.save(specie);
	}

}
