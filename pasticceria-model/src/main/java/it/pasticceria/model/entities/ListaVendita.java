package it.pasticceria.model.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "lista_vendita")
public class ListaVendita implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_lista_vendita", unique = true, nullable = false)
	private Integer tokenListaVendita;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "token_dolce")
	private Dolce dolce;
	
	@Column(name = "quantita")
	private Integer quantita;
	
	@Column(name = "data_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTimestamp;
	
	private static final long serialVersionUID = 1L;

	public ListaVendita() {
		super();
	}   
	
	public ListaVendita(ListaVendita lv) {
		this.quantita = lv.getQuantita();
	}   
	
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
