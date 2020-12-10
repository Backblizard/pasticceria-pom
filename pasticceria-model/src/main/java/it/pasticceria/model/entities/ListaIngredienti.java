package it.pasticceria.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "lista_ingredienti")
public class ListaIngredienti implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_lista_ingredienti", unique = true, nullable = false)
	private Integer tokenListaIngredienti;
	
	@ManyToOne
	@JoinColumn(name = "token_dolce")
	private Dolce dolce;
	
	@OneToOne
	@JoinColumn(name = "token_ingrediente")
	private Ingrediente ingrediente;
	
	@Column(name = "quantita")
	private Integer quantita;
	
	@Column(name = "unita_di_misura")
	private String unitaDiMisura;
	
	@Column(name = "titolo_sezione")
	private String titoloSezione;
	
	@Column(name = "data_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTimestamp;
	
	private static final long serialVersionUID = 1L;

	public ListaIngredienti() {
		super();
	}   
	
	public ListaIngredienti(ListaIngredienti lv) {
		this.dolce = lv.getDolce();
		this.ingrediente = lv.getIngrediente();
		this.quantita = lv.getQuantita();
		this.unitaDiMisura = lv.getUnitaDiMisura();
		this.dataTimestamp = lv.getDataTimestamp();
	}

	public Integer getTokenListaIngredienti() {
		return tokenListaIngredienti;
	}

	public void setTokenListaIngredienti(Integer tokenListaVendita) {
		this.tokenListaIngredienti = tokenListaVendita;
	}

	public Dolce getDolce() {
		return dolce;
	}

	public void setDolce(Dolce dolce) {
		this.dolce = dolce;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public Date getDataTimestamp() {
		return dataTimestamp;
	}

	public void setDataTimestamp(Date dataTimestamp) {
		this.dataTimestamp = dataTimestamp;
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
	
   
}
