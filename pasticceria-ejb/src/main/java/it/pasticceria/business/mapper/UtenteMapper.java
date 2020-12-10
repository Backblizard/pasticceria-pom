package it.pasticceria.business.mapper;

import javax.enterprise.context.Dependent;

import it.pasticceria.beans.UtenteFe;
import it.pasticceria.model.entities.Utente;

@Dependent 
public class UtenteMapper {
	
	public UtenteFe mapEntityToBean(Utente entity) {
		UtenteFe utenteFe = new UtenteFe();
		utenteFe.setUser(entity.getUser());
		utenteFe.setPassword(entity.getPassword());
		return utenteFe;
	}
	
	public Utente mapBeanToEntity(UtenteFe bean) {
		Utente utente = new Utente();
		utente.setUser(bean.getUser());
		utente.setPassword(bean.getPassword());
		return utente;
	}
}
