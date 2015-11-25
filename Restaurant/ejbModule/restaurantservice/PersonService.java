package restaurantservice;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import restaurantentities.Person;

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
	
	public Person login(String username, String password){
		Person person;
		person = em().createQuery("FROM Person where uname = :value1 AND password = :value2" , Person.class)
                .setParameter("value1", username)
                .setParameter("value2", password)
                .getSingleResult();
		return person;
	}
	
	public Person findByUsername(String uname){
		Person person;
		person = em().createQuery("FROM Person where uname = :value1", Person.class)
                .setParameter("value1", uname).getSingleResult();
		return person;
	}
	

}
