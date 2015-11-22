package restaurantservice;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class FoodService
 */
@Stateless
@LocalBean
public class FoodService extends AbstractFacade<Food> implements FoodServiceRemote, FoodServiceLocal {

	@PersistenceContext
	EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public FoodService() {
        super(Food.class);
    }

	@Override
	protected EntityManager em() {
		return entityManager;
	}

}
