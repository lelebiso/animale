package it.pegaso2000.animale.dto;

import it.pegaso2000.animale.model.Specie;

public class AccessorioDto {
	private int id;
	private int prezzo;
	private String descrizione;
	

	private Specie specie;
	
	public AccessorioDto() {
	}

	public AccessorioDto(int id, int prezzo, String descrizione) {
		super();
		this.id = id;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
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
}
