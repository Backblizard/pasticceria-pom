package it.pasticceria.business.mapper;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import it.pasticceria.beans.ListaIngredientiFe;
import it.pasticceria.model.entities.Dolce;
import it.pasticceria.model.entities.ListaIngredienti;

@Dependent 
public class ListaIngredientiMapper {
	
	@Inject
	private IngredienteMapper ingredienteMapper;
	
	public ListaIngredientiFe mapEntityToBean(ListaIngredienti entity) {
		ListaIngredientiFe listaIngredientiFe = new ListaIngredientiFe();
		listaIngredientiFe.setDataTimestamp(entity.getDataTimestamp());
		listaIngredientiFe.setTokenDolce(entity.getDolce().getTokenDolce());
		listaIngredientiFe.setIngrediente(ingredienteMapper.mapEntityToBean(entity.getIngrediente()));
		listaIngredientiFe.setQuantita(entity.getQuantita());
		listaIngredientiFe.setTitoloSezione(entity.getTitoloSezione());
		listaIngredientiFe.setTokenListaIngredienti(entity.getTokenListaIngredienti());	
		listaIngredientiFe.setUnitaDiMisura(entity.getUnitaDiMisura());
		return listaIngredientiFe;
	}
	
	public ListaIngredienti mapBeanToEntity(ListaIngredientiFe bean) {
		ListaIngredienti listaIngredienti = new ListaIngredienti();
		listaIngredienti.setDataTimestamp(bean.getDataTimestamp());
		Dolce dolce = new Dolce();
		dolce.setTokenDolce(bean.getTokenDolce());
		listaIngredienti.setDolce(dolce);
		listaIngredienti.setIngrediente(ingredienteMapper.mapBeanToEntity(bean.getIngrediente()));
		listaIngredienti.setQuantita(bean.getQuantita());
		listaIngredienti.setTitoloSezione(bean.getTitoloSezione());
		listaIngredienti.setTokenListaIngredienti(bean.getTokenListaIngredienti());	
		listaIngredienti.setUnitaDiMisura(bean.getUnitaDiMisura());
		return listaIngredienti;
	}
}
