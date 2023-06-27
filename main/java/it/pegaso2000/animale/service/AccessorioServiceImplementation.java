package it.pegaso2000.animale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pegaso2000.animale.model.Accessorio;
import it.pegaso2000.animale.repo.AccessorioRepo;

@Service
public class AccessorioServiceImplementation implements AccessorioService {

	private AccessorioRepo acRepo;

	@Autowired
	public AccessorioServiceImplementation(AccessorioRepo acRepo) {
		super();
		this.acRepo = acRepo;
	}

	@Override
	public boolean delete(int id) {
		Optional<Accessorio> ac = acRepo.findById(id);
		if (ac.isPresent()) {
			acRepo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Accessorio> findAll() {
		return acRepo.findAll();
	}

	@Override
	public Accessorio findById(int id) {
		Optional<Accessorio> ac = acRepo.findById(id);
		if (ac.isPresent()) return ac.get();
		return null;
	}

	@Override
	public Accessorio save(Accessorio accessorio) {
		return acRepo.save(accessorio);
	}

}
