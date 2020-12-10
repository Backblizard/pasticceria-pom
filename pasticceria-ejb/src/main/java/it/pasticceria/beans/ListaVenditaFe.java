package it.pasticceria.beans;

import java.io.Serializable;
import java.util.Date;

public class ListaVenditaFe implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer tokenListaVendita;
	private DolceFe dolce;
	private Integer quantita;
	private Date dataTimestamp;
	

	public ListaVenditaFe() {
		super();
	}   
	public Integer getTokenListaVendita() {
		return this.tokenListaVendita;
	}

	public void setTokenListaVendita(Integer tokenListaVendita) {
		this.tokenListaVendita = tokenListaVendita;
	}   
	
	public Date getDataTimestamp() {
		return dataTimestamp;
	}
	public void setDataTimestamp(Date dataTimestamp) {
		this.dataTimestamp = dataTimestamp;
	}

	public Integer getQuantita() {
		return this.quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	
    public DolceFe getDolce() {
		return dolce;
	}
	public void setDolce(DolceFe dolce) {
		this.dolce = dolce;
	}
   
}
