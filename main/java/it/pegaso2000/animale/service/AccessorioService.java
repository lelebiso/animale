package it.pegaso2000.animale.service;

import java.util.List;

import it.pegaso2000.animale.model.Accessorio;

public interface AccessorioService {

	List<Accessorio> findAll();
	Accessorio save(Accessorio accessorio);
	Accessorio findById(int id);
	boolean delete(int id);
}
