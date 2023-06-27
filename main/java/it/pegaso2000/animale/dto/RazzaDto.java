package it.pegaso2000.animale.dto;

import java.util.List;

import it.pegaso2000.animale.model.Animale;
import it.pegaso2000.animale.model.Specie;

public class RazzaDto {
	private int id;
	private String descrizione;
	
	private Specie specie;
	
	private List<Animale> animale;
	
	public RazzaDto() {}

	public RazzaDto(int id, String descrizione) {
		super();
		this.id = id;
		this.descrizione = descrizione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Specie getSpecie() {
		return specie;
	}

	public void setSpecie(Specie specie) {
		this.specie = specie;
	}

	public List<Animale> getAnimale() {
		return animale;
	}

	public void setAnimale(List<Animale> animale) {
		this.animale = animale;
	}
}
