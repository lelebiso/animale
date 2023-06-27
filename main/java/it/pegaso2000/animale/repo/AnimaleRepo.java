package it.pegaso2000.animale.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import it.pegaso2000.animale.model.Animale;

public interface AnimaleRepo extends JpaRepository<Animale, Integer>{

}
