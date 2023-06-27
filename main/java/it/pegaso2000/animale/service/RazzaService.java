package it.pegaso2000.animale.service;

import java.util.List;

import it.pegaso2000.animale.model.Razza;

public interface RazzaService {

	List<Razza> findAll();
	Razza save(Razza razza);
	Razza findById(int id);
	boolean delete(int id);
}
