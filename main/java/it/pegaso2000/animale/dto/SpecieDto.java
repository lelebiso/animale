package it.pegaso2000.animale.dto;

import java.util.List;

import it.pegaso2000.animale.model.Accessorio;
import it.pegaso2000.animale.model.Razza;

public class SpecieDto {
	private int id;
	private String descrizione;
	
	private List<Razza> razza;
	
 	private List<Accessorio> accessorio;	
	
	public SpecieDto() {}

	public SpecieDto(int id, String descrizione) {
		super();
		this.id = id;
		this.descrizione = descrizione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Razza> getRazza() {
		return razza;
	}

	public void setRazza(List<Razza> razza) {
		this.razza = razza;
	}

	public List<Accessorio> getAccessorio() {
		return accessorio;
	}

	public void setAccessorio(List<Accessorio> accessorio) {
		this.accessorio = accessorio;
	}
}
