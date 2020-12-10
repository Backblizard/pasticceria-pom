package it.test.pasticceria.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import it.pasticceria.beans.DolceFe;
import it.pasticceria.beans.ListaVenditaFe;
import it.pasticceria.beans.ListaVenditaResultFe;
import it.pasticceria.beans.UtenteFe;
import it.pasticceria.business.manager.intf.UserManager;
import it.pasticceria.business.manager.intf.VenditaManager;


@Path("/backOffice")
@RequestScoped
public class RestEasyService {
	
	@Inject
	private VenditaManager venditaManager;
	
	@Inject
	private UserManager userManager;
	
	@POST
    @Path("inserimentoDolce")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public ListaVenditaResultFe inserimentoDolce(ListaVenditaFe listaVenditaFe) {
		return venditaManager.inserimentoDolci(listaVenditaFe);
	}
	
	@GET
    @Path("getDolciList")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public List<DolceFe> getDolciList() {
		return venditaManager.getDolciList();	
	}
	
	@GET
    @Path("getListaVendita")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public List<ListaVenditaFe> getListaVendita() {
		return venditaManager.getListaVendita();	
	}
	
	@POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response userLogin(UtenteFe utenteFe) {
		return userManager.userLogin(utenteFe);
	}
}
