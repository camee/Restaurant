package restaurantservice;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class PersonService
 */
@Stateless
@LocalBean
public class PersonService extends AbstractFacade<Person> implements PersonServiceRemote, PersonServiceLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext
	EntityManager entityManager;

	public PersonService() {
		super(Person.class);
	}

	@Override
	protected EntityManager em() {
		return entityManager;
	}


	@Override
	public int add(int a, int b) {

		return a + b;

	}
}
