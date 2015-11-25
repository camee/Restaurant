package restaurantservice;

import javax.ejb.Local;

@Local
public interface RestaurantBeanLocal {
	
	public void setName(String name);


}
