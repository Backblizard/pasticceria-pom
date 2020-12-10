package it.pasticceria.model;

import java.util.List;

import it.pasticceria.model.bean.RicercaUtenteRequest;
import it.pasticceria.model.entities.Utente;

public interface UserRepository extends AbstractRepository {
	List<Utente> validator(RicercaUtenteRequest ricerca);
}
