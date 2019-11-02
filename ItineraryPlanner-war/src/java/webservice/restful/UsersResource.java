package webservice.restful;

import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import session.UsersSessionLocal;

@Path("users")
public class UsersResource {

    @EJB
    private UsersSessionLocal userSessionLocal;
    
}
