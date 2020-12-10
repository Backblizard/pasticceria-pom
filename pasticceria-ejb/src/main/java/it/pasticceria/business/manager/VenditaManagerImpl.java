package it.pasticceria.business.manager;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import it.pasticceria.beans.DolceFe;
import it.pasticceria.beans.ListaVenditaFe;
import it.pasticceria.beans.ListaVenditaResultFe;
import it.pasticceria.business.manager.intf.VenditaManager;
import it.pasticceria.business.mapper.DolceMapper;
import it.pasticceria.business.mapper.ListaVenditaMapper;
import it.pasticceria.model.DolciRepository;
import it.pasticceria.model.entities.Dolce;
import it.pasticceria.model.entities.ListaVendita;

@Stateless
public class VenditaManagerImpl implements VenditaManager {
	
	@Inject
	private ListaVenditaMapper listaVenditaMapper;
	
	@Inject
	private DolceMapper dolceMapper;
	
	@Inject
	private DolciRepository dolciRepo;
	
	@Override
    public ListaVenditaResultFe inserimentoDolci(ListaVenditaFe listaVenditaFe) {
		ListaVenditaResultFe result = new ListaVenditaResultFe();
		ListaVendita listaVendita = listaVenditaMapper.mapBeanToEntity(listaVenditaFe);
		try {
			dolciRepo.persist(listaVendita);
			result.setMessage("OK");
		} catch(Exception e) {
			result.setMessage("KO");
		}
        return result;
    }
	
	@Override
    public List<DolceFe> getDolciList() {	
		List<Dolce> dolceList = dolciRepo.getDolci(null);	
		List<DolceFe> dolceBeanList = new ArrayList<DolceFe>();		
		dolceList.stream().forEach(c -> {
			dolceBeanList.add(dolceMapper.mapEntityToBean(c));
		});
		return dolceBeanList;
	}
	
	@Override
    public List<ListaVenditaFe> getListaVendita() {	
		List<ListaVendita> dolceList = dolciRepo.getListaVendita(null);	
		List<ListaVenditaFe> listaVenditaList = new ArrayList<ListaVenditaFe>();	
		dolceList.stream().forEach(c -> {
			listaVenditaList.add(listaVenditaMapper.mapEntityToBean(c));
		});		
		return listaVenditaList;
	}

	
}
