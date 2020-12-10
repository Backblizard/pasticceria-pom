package it.pasticceria.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingrediente")
public class Ingrediente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_ingrediente", unique = true, nullable = false)
	private Integer tokenIngrediente;
	
	@Column(name = "nome")
	private String nome;
	

	private static final long serialVersionUID = 1L;
	
	public Ingrediente() {
		super();
	}

	public Ingrediente(Ingrediente ingrediente) {
		this.nome = ingrediente.getNome();
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
