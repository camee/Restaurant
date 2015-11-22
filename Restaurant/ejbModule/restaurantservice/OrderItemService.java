package restaurantservice;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class OrderItemService
 */
@Stateless
@LocalBean
public class OrderItemService extends AbstractFacade<OrderItem> implements OrderItemServiceRemote, OrderItemServiceLocal {


	@PersistenceContext
	EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public OrderItemService() {
        super(OrderItem.class);
    }

	@Override
	protected EntityManager em() {
		return entityManager;
	}

}
