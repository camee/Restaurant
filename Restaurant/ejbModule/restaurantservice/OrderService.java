package restaurantservice;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import restaurantentities.Order;

/**
 * Session Bean implementation class OrderService
 */
@Stateless
@LocalBean
public class OrderService extends AbstractFacade<Order> implements OrderServiceRemote, OrderServiceLocal {

	@PersistenceContext
	EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public OrderService() {
        super(Order.class);
    }

	@Override
	protected EntityManager em() {
		return entityManager;
	}
}
