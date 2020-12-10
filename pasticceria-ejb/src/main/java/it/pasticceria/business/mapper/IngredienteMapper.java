package it.pasticceria.business.mapper;

import javax.enterprise.context.Dependent;

import it.pasticceria.beans.IngredienteFe;
import it.pasticceria.model.entities.Ingrediente;

@Dependent 
public class IngredienteMapper {
	
	public IngredienteFe mapEntityToBean(Ingrediente entity) {
		IngredienteFe ingredienteFe = new IngredienteFe();
		ingredienteFe.setTokenIngrediente(entity.getTokenIngrediente());
		ingredienteFe.setNome(entity.getNome());
		return ingredienteFe;
	}
	
	public Ingrediente mapBeanToEntity(IngredienteFe bean) {
		Ingrediente ingrediente = new Ingrediente();
		ingrediente.setNome(bean.getNome());
		return ingrediente;
	}
}
