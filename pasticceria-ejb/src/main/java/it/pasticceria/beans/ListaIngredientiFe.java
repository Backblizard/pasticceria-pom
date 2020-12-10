package it.pasticceria.beans;

import java.io.Serializable;
import java.util.Date;

public class ListaIngredientiFe implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer tokenListaIngredienti;
	private Integer tokenDolce;
	private IngredienteFe ingrediente;
	private Integer quantita;
	private String unitaDiMisura;
	private String titoloSezione;
    private Date dataTimestamp;
	

	public ListaIngredientiFe() {
		super();
	}


	public Integer getTokenListaIngredienti() {
		return tokenListaIngredienti;
	}


	public void setTokenListaIngredienti(Integer tokenListaIngredienti) {
		this.tokenListaIngredienti = tokenListaIngredienti;
	}


	public IngredienteFe getIngrediente() {
		return ingrediente;
	}


	public void setIngrediente(IngredienteFe ingrediente) {
		this.ingrediente = ingrediente;
	}


	public Integer getQuantita() {
		return quantita;
	}


	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}


	public String getUnitaDiMisura() {
		return unitaDiMisura;
	}


	public void setUnitaDiMisura(String unitaDiMisura) {
		this.unitaDiMisura = unitaDiMisura;
	}


	public String getTitoloSezione() {
		return titoloSezione;
	}


	public void setTitoloSezione(String titoloSezione) {
		this.titoloSezione = titoloSezione;
	}


	public Date getDataTimestamp() {
		return dataTimestamp;
	}


	public void setDataTimestamp(Date dataTimestamp) {
		this.dataTimestamp = dataTimestamp;
	}


	public Integer getTokenDolce() {
		return tokenDolce;
	}


	public void setTokenDolce(Integer tokenDolce) {
		this.tokenDolce = tokenDolce;
	}   

	
   
}
