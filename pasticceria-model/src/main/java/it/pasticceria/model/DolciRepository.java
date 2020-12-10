package it.pasticceria.model;

import java.util.List;

import it.pasticceria.model.bean.RicercaDolceRequest;
import it.pasticceria.model.bean.RicercaListaVenditaRequest;
import it.pasticceria.model.entities.Dolce;
import it.pasticceria.model.entities.ListaVendita;

public interface DolciRepository extends AbstractRepository {
	List<Dolce> getDolci(RicercaDolceRequest ricerca); 
	
	List<ListaVendita> getListaVendita(RicercaListaVenditaRequest ricerca); 
}
