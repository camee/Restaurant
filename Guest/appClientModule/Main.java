import javax.ejb.EJB;

import restaurantentities.Food;
import restaurantentities.Person;
import restaurantservice.RestaurantBeanRemote;
import restaurantservice.PersonServiceRemote;

public class Main {
	@EJB
	private static PersonServiceRemote personService;
	@EJB
	private static RestaurantBeanRemote restaurantBean;
	
	public static void main(String[] args) {
		//System.out.println(personService.add(5, 11));
		restaurantBean.setName("Brownie");
		//restaurantBean.createFood("Lebbencs Leves", 550);
		Food food = new Food();
		food.setName("hello Tiramisu");
		restaurantBean.helloFood(food);
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}