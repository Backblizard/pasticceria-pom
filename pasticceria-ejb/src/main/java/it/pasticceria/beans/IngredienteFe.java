package it.pasticceria.beans;

import java.io.Serializable;

public class IngredienteFe implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer tokenIngrediente;
	private String nome;
	
	public IngredienteFe() {
		super();
	}
	
	public Integer getTokenIngrediente() {
		return tokenIngrediente;
	}

	public void setTokenIngrediente(Integer tokenIngrediente) {
		this.tokenIngrediente = tokenIngrediente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
   
}
