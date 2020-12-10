package it.pasticceria.business.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import it.pasticceria.beans.DolceFe;
import it.pasticceria.beans.ListaIngredientiFe;
import it.pasticceria.model.entities.Dolce;
import it.pasticceria.model.entities.ListaIngredienti;

@Dependent 
public class DolceMapper {
	
	@Inject
	private ListaIngredientiMapper listaIngredientiMapper;
	
	public DolceFe mapEntityToBean(Dolce entity) {
		DolceFe dolceFe = new DolceFe();
		dolceFe.setNome(entity.getNome());
		dolceFe.setPrezzo(entity.getPrezzo());
		dolceFe.setTokenDolce(entity.getTokenDolce());
		List<ListaIngredientiFe> listaIngredienti = new ArrayList<ListaIngredientiFe>();
		for(ListaIngredienti li: entity.getListaIngredienti()) {
			listaIngredienti.add(listaIngredientiMapper.mapEntityToBean(li));
		}
		dolceFe.setListaIngredienti(listaIngredienti);
		return dolceFe;
	}
	
	public Dolce mapBeanToEntity(DolceFe bean) {
		Dolce dolce = new Dolce();
		dolce.setNome(bean.getNome());
		dolce.setPrezzo(bean.getPrezzo());
		return dolce;
	}
}
