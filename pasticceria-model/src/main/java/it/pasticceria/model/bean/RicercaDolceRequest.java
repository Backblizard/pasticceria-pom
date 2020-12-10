package it.pasticceria.model.bean;

import java.math.BigDecimal;

public class RicercaDolceRequest {
	private Integer tokenDolce;
	private String nome;
	private BigDecimal prezzo;
	
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
}
