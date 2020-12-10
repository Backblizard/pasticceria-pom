package it.pasticceria.business.manager;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.core.Response;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import it.pasticceria.beans.UtenteFe;
import it.pasticceria.business.manager.intf.UserManager;
import it.pasticceria.model.UserRepository;
import it.pasticceria.model.bean.RicercaUtenteRequest;
import it.pasticceria.model.entities.Utente;

@Stateless
public class UserManagerImpl implements UserManager {
	
	@Inject
	private UserRepository userRepository;
	
	@Override
	public Response userLogin(UtenteFe utenteFe) {
		RicercaUtenteRequest ricerca = new RicercaUtenteRequest();
		ricerca.setUser(utenteFe.getUser());
		ricerca.setPassword(utenteFe.getPassword());
		List<Utente> utenteList = userRepository.validator(ricerca);
		if(utenteList.size() > 0) {
			Utente utente = utenteList.get(0);
			String KEY = "k_jwt";
			long tempo = System.currentTimeMillis();
			String jwt = Jwts.builder()
						 .signWith(SignatureAlgorithm.HS256, KEY)
						 .setSubject(utente.getUser())
						 .setIssuedAt(new Date(tempo))
						 .setExpiration(new Date(tempo + 900000))
						 .claim("user", utente.getUser())
						 .compact();
			JsonObject json = Json.createObjectBuilder()
								  .add("JWT",jwt).build();
			return Response.status(Response.Status.CREATED).entity(json).build();
		}
		return Response.status(Response.Status.UNAUTHORIZED).build();
	}
	
}
