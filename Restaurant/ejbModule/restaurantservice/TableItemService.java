package restaurantservice;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class TableItemService
 */
@Stateless
@LocalBean
public class TableItemService extends AbstractFacade<TableItem> implements TableItemServiceRemote, TableItemServiceLocal {

	@PersistenceContext
	EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public TableItemService() {
        super(TableItem.class);
    }

	@Override
	protected EntityManager em() {
		return entityManager;
	}

}
