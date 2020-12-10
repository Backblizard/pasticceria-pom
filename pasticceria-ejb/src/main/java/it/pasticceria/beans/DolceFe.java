package it.pasticceria.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class DolceFe implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer tokenDolce;
	private String nome;
	private BigDecimal prezzo;
	private List<ListaIngredientiFe> listaIngredienti = new ArrayList<>();

	
	public Integer getTokenDolce() {
		return this.tokenDolce;
	}

	public void setTokenDolce(Integer tokenDolce) {
		this.tokenDolce = tokenDolce;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public BigDecimal getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public List<ListaIngredientiFe> getListaIngredienti() {
		return listaIngredienti;
	}

	public void setListaIngredienti(List<ListaIngredientiFe> listaIngredienti) {
		this.listaIngredienti = listaIngredienti;
	}   
}
