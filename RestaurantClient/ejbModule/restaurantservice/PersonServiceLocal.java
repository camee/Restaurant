package restaurantservice;

import javax.ejb.Local;

@Local
public interface PersonServiceLocal {

	public int add(int a, int b);
}
