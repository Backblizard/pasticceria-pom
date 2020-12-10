package it.pasticceria.model.bean;

import java.util.Date;

import it.pasticceria.model.entities.Dolce;

public class RicercaListaVenditaRequest {

	private Integer tokenListaVendita;
	private Dolce dolce;
	private Integer quantita;
    private Date dataTimestamp;
	 
	public Integer getTokenListaVendita() {
		return this.tokenListaVendita;
	}

	public void setTokenListaVendita(Integer tokenListaVendita) {
		this.tokenListaVendita = tokenListaVendita;
	}   
	public Dolce getDolce() {
		return this.dolce;
	}

	public void setDolce(Dolce dolce) {
		this.dolce = dolce;
	}   
	public Integer getQuantita() {
		return this.quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	
	public Date getDataTimestamp() {
		return dataTimestamp;
	}
	public void setDataTimestamp(Date dataTimestamp) {
		this.dataTimestamp = dataTimestamp;
	}
   
}
