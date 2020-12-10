package it.pasticceria.business.mapper;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import it.pasticceria.beans.ListaVenditaFe;
import it.pasticceria.model.entities.Dolce;
import it.pasticceria.model.entities.ListaVendita;

@Dependent 
public class ListaVenditaMapper {
	
	@Inject
	private DolceMapper dolceMapper;
	
	public ListaVenditaFe mapEntityToBean(ListaVendita entity) {
		ListaVenditaFe listaVenditaFe = new ListaVenditaFe();
		listaVenditaFe.setQuantita(entity.getQuantita());
		listaVenditaFe.setDolce(dolceMapper.mapEntityToBean(entity.getDolce()));
		listaVenditaFe.setDataTimestamp(entity.getDataTimestamp());
		listaVenditaFe.setTokenListaVendita(entity.getTokenListaVendita());
		return listaVenditaFe;
	}
	
	public ListaVendita mapBeanToEntity(ListaVenditaFe bean) {
		ListaVendita listaVendita = new ListaVendita();
		listaVendita.setQuantita(bean.getQuantita());
		if(bean.getDolce() != null) {
			Dolce dolce = new Dolce();
			dolce.setTokenDolce(bean.getDolce().getTokenDolce());
			listaVendita.setDolce(dolce);
		}
		listaVendita.setDataTimestamp(bean.getDataTimestamp());
		return listaVendita;
	}
}
