package it.pegaso2000.animale.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accessorio")
public class Accessorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int prezzo;
	private String descrizione;
	
	@ManyToOne
	@JoinColumn(name = "specie_id")
	private Specie specie;
	
	public Accessorio() {
	}

	public Accessorio(int id, int prezzo, String descrizione) {
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
