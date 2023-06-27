package it.pegaso2000.animale.dto;

import it.pegaso2000.animale.model.Razza;

public class AnimaleDto {
	private int id;
	private String nome;
	
	private Razza razza;
	
	public AnimaleDto() {}

	public AnimaleDto(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Razza getRazza() {
		return razza;
	}

	public void setRazza(Razza razza) {
		this.razza = razza;
	}
}
