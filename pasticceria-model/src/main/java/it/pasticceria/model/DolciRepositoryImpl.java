package it.pasticceria.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.Dependent;
import javax.persistence.TypedQuery;

import it.pasticceria.model.bean.RicercaDolceRequest;
import it.pasticceria.model.bean.RicercaListaVenditaRequest;
import it.pasticceria.model.entities.Dolce;
import it.pasticceria.model.entities.ListaVendita;

@Dependent
public class DolciRepositoryImpl extends AbstractRepositoryImpl implements DolciRepository {
	
	@Override
	public List<Dolce> getDolci(RicercaDolceRequest ricerca){
		Map<String, Object> parametri = new HashMap<>();

        StringBuilder strQuery = new StringBuilder("SELECT d FROM Dolce d WHERE 1=1 ");
        
        if(ricerca != null) {
	        if(ricerca.getTokenDolce() != null) {
	        	strQuery.append("AND d.token_dolce = :token_dolce ");
	        	parametri.put("token_dolce", ricerca.getTokenDolce());
	        }
	        
	        if(ricerca.getNome() != null) {
	        	strQuery.append("AND d.nome = :nome ");
	        	parametri.put("nome", ricerca.getNome());
	        }
	        
	        if(ricerca.getPrezzo() != null) {
	        	strQuery.append("AND d.prezzo = :prezzo ");
	        	parametri.put("prezzo", ricerca.getNome());
	        }
        }
        
        TypedQuery<Dolce> query = entityManager.createQuery(strQuery.toString(), Dolce.class);
        parametri.forEach((k, v) -> query.setParameter(k, v));
        
        return query.getResultList();
	}
	
	@Override
	public List<ListaVendita> getListaVendita(RicercaListaVenditaRequest ricerca){
		Map<String, Object> parametri = new HashMap<>();

        StringBuilder strQuery = new StringBuilder("SELECT lv FROM ListaVendita lv JOIN FETCH lv.dolce d WHERE 1=1 ");
        
        if(ricerca != null) {
	        if(ricerca.getTokenListaVendita() != null) {
	        	strQuery.append("AND lv.token_lista_vendita = :token_lista_vendita ");
	        	parametri.put("token_dolce", ricerca.getTokenListaVendita());
	        }
	        
	        if(ricerca.getDolce() != null && ricerca.getDolce().getTokenDolce() != null) {
	        	strQuery.append("AND lv.token_dolce = :token_dolce ");
	        	parametri.put("nome", ricerca.getDolce().getTokenDolce());
	        }
	        
	        if(ricerca.getQuantita() != null) {
	        	strQuery.append("AND lv.quantita = :quantita ");
	        	parametri.put("prezzo", ricerca.getQuantita());
	        }
        }
        
        TypedQuery<ListaVendita> query = entityManager.createQuery(strQuery.toString(), ListaVendita.class);
        parametri.forEach((k, v) -> query.setParameter(k, v));
        
        return query.getResultList();
	}
}
