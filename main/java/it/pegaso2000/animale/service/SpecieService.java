package it.pegaso2000.animale.service;

import java.util.List;

import it.pegaso2000.animale.model.Specie;

public interface SpecieService {

	List<Specie> findAll();
	Specie save(Specie specie);
	Specie findById(int id);
	boolean delete(int id);
}
