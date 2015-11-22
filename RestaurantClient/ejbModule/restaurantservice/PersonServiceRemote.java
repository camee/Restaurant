package restaurantservice;

import javax.ejb.Remote;

@Remote
public interface PersonServiceRemote {

	public int add(int a, int b);
}
