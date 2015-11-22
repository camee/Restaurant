package restaurantservice;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Session Bean implementation class PersonBean
 */
@Stateless
@LocalBean
@ManagedBean(name = "person")
@RequestScoped
public class PersonBean implements PersonBeanRemote, PersonBeanLocal {


		@EJB
		PersonService service;
		Person person = new Person();
		
		public void setName(String name){
			person.setName(name);
			service.create(person);
		}
		

    /**
     * Default constructor. 
     */
    public PersonBean() {
        // TODO Auto-generated constructor stub
    }


}
