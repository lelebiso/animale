package it.pegaso2000.animale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pegaso2000.animale.model.Razza;
import it.pegaso2000.animale.repo.RazzaRepo;

@Service
public class RazzaServiceImplementation implements RazzaService {

	private RazzaRepo rRepo;

	@Autowired
	public RazzaServiceImplementation(RazzaRepo rRepo) {
		super();
		this.rRepo = rRepo;
	}

	@Override
	public boolean delete(int id) {
		Optional<Razza> r = rRepo.findById(id);
		if (r.isPresent()) {
			rRepo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Razza> findAll() {
		return rRepo.findAll();
	}

	@Override
	public Razza findById(int id) {
		Optional<Razza> r = rRepo.findById(id);
		if (r.isPresent())
			return r.get();
		return null;
	}

	@Override
	public Razza save(Razza razza) {
		return rRepo.save(razza);
	}

}
