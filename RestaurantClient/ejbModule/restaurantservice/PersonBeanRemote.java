package restaurantservice;

import javax.ejb.Remote;

@Remote
public interface PersonBeanRemote {

	public void setName(String name);
	
}
