package restaurantservice;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class FeedbackService
 */
@Stateless
@LocalBean
public class FeedbackService extends AbstractFacade<Feedback> implements FeedbackServiceRemote, FeedbackServiceLocal {

	
	@PersistenceContext
	EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public FeedbackService() {
        super(Feedback.class);
    }

	@Override
	protected EntityManager em() {
		return entityManager;
	}

}
