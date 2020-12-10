package it.pasticceria.beans;

import java.io.Serializable;
import java.util.Date;

public class ListaVenditaResultFe implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer tokenListaVendita;
	private Integer tokenDolce;
	private Integer quantita;
    private Date dataTimestamp;
    private String message;
		

	public ListaVenditaResultFe() {
		super();
	}   
	public Integer getTokenListaVendita() {
		return this.tokenListaVendita;
	}

	public void setTokenListaVendita(Integer tokenListaVendita) {
		this.tokenListaVendita = tokenListaVendita;
	}   
	
	public Integer getTokenDolce() {
		return tokenDolce;
	}
	public void setTokenDolce(Integer tokenDolce) {
		this.tokenDolce = tokenDolce;
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
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
   
}
