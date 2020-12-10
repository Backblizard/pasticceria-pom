package it.pasticceria.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_utente", unique = true, nullable = false)
	private Integer tokenUtente;
	
	@Column(name = "user")
	private String user;
	
	@Column(name = "password")
	private String password;

	private static final long serialVersionUID = 1L;
	
	public Utente() {
		super();
	}

	public Utente(Utente dolce) {
		this.user = dolce.getUser();
		this.password = dolce.getPassword();
	}

	public Integer getTokenUtente() {
		return tokenUtente;
	}

	public void setTokenUtente(Integer tokenUtente) {
		this.tokenUtente = tokenUtente;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
