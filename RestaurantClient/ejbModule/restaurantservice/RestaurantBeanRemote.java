package restaurantservice;

import javax.ejb.Remote;

import restaurantentities.Food;
import restaurantentities.Person;

@Remote
public interface RestaurantBeanRemote {

	public void setName(String name);
	
	public Person helloPerson(Person person);
	
	public void createFood(String name, Integer price);
	
	public Food helloFood(Food food);
}
