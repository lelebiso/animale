package it.pegaso2000.animale.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "specie")
public class Specie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String descrizione;
	
	@OneToMany(mappedBy = "specie")
	private List<Razza> razza;
	
	@OneToMany(mappedBy = "specie")
	private List<Accessorio> accessorio;	
	
	public Specie() {}

	public Specie(int id, String descrizione) {
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
