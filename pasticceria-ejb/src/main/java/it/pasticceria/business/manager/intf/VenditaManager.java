package it.pasticceria.business.manager.intf;

import java.util.List;

import it.pasticceria.beans.DolceFe;
import it.pasticceria.beans.ListaVenditaFe;
import it.pasticceria.beans.ListaVenditaResultFe;

public interface VenditaManager {
	ListaVenditaResultFe inserimentoDolci(ListaVenditaFe listaVenditaFe);
	
	List<DolceFe> getDolciList();
	
	List<ListaVenditaFe> getListaVendita();
}
