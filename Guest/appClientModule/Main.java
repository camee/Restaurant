import javax.ejb.EJB;

import restaurantservice.PersonBeanRemote;
import restaurantservice.PersonServiceRemote;

public class Main {
	@EJB
	private static PersonServiceRemote personService;
	private static PersonBeanRemote personBean;
	
	public static void main(String[] args) {
		System.out.println(personService.add(5, 11));
		personBean.setName("Szandi");
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}