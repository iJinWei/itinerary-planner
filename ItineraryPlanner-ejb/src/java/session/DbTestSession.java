package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DbTestSession implements DbTestSessionLocal {

    @PersistenceContext
    private EntityManager em;
    
}
