package it.pasticceria.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dolce")
public class Dolce implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_dolce", unique = true, nullable = false)
	private Integer tokenDolce;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "prezzo")
	private BigDecimal prezzo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dolce", cascade = CascadeType.ALL)
    private Set<ListaVendita> listaVenditaList = new HashSet<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dolce", cascade = CascadeType.ALL)
	private Set<ListaIngredienti> listaIngredienti = new HashSet<>();

	private static final long serialVersionUID = 1L;
	
	public Dolce() {
		super();
	}

	public Dolce(Dolce dolce) {
		this.nome = dolce.getNome();
		this.prezzo = dolce.getPrezzo();
	}

	public Integer getTokenDolce() {
		return tokenDolce;
	}

	public void setTokenDolce(Integer tokenDolce) {
		this.tokenDolce = tokenDolce;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public Set<ListaVendita> getListaVenditaList() {
		return listaVenditaList;
	}

	public void setListaVenditaList(Set<ListaVendita> listaVenditaList) {
		this.listaVenditaList = listaVenditaList;
	}

	public Set<ListaIngredienti> getListaIngredienti() {
		return listaIngredienti;
	}

	public void setListaIngredienti(Set<ListaIngredienti> listaIngredienti) {
		this.listaIngredienti = listaIngredienti;
	}   
	
	public void addListaVendita(ListaVendita alistaVendita) {
        this.listaVenditaList.add(alistaVendita);
        alistaVendita.setDolce(this);
    }
	
	public void addListaIngredienti(ListaIngredienti alistaIngredienti) {
        this.listaIngredienti.add(alistaIngredienti);
        alistaIngredienti.setDolce(this);
    }

}
