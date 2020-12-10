package it.pasticceria.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.Dependent;
import javax.persistence.TypedQuery;

import it.pasticceria.model.bean.RicercaUtenteRequest;
import it.pasticceria.model.entities.Utente;
import it.pasticceria.utils.CommonUtils;

@Dependent
public class UserRepositoryImpl extends AbstractRepositoryImpl implements UserRepository {
	
	@Override
	public List<Utente> validator(RicercaUtenteRequest ricerca){
		Map<String, Object> parametri = new HashMap<>();

        StringBuilder strQuery = new StringBuilder("SELECT u FROM Utente u WHERE 1=1 ");
        
	    strQuery.append("AND u.user = :user ");
	    parametri.put("user", ricerca.getUser() != null ? ricerca.getUser() : ""); 
	    
	    strQuery.append("AND u.password = :password ");
	    parametri.put("password", CommonUtils.get_SHA_512_SecurePassword(ricerca.getPassword() != null ? ricerca.getPassword() : "", "pde"));
        
        TypedQuery<Utente> query = entityManager.createQuery(strQuery.toString(), Utente.class);
        parametri.forEach((k, v) -> query.setParameter(k, v));
        
        return query.getResultList();
	}
	
}
