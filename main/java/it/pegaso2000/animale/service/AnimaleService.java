package it.pegaso2000.animale.service;

import java.util.List;

import it.pegaso2000.animale.model.Animale;

public interface AnimaleService {

	List<Animale> findAll();
	Animale save(Animale animale);
	Animale findById(int id);
	boolean delete(int id);
}
