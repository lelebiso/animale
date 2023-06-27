package it.pegaso2000.animale.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "razza")
public class Razza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descrizione;
	
	@ManyToOne
	@JoinColumn(name = "specie_id")
	private Specie specie;
	
	@OneToMany(mappedBy = "razza")
	private List<Animale> animale;
	
	public Razza() {}

	public Razza(int id, String descrizione) {
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
