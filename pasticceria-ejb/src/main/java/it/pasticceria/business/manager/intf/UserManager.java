package it.pasticceria.business.manager.intf;

import javax.ws.rs.core.Response;

import it.pasticceria.beans.UtenteFe;

public interface UserManager {
	Response userLogin(UtenteFe utenteFe);

}
