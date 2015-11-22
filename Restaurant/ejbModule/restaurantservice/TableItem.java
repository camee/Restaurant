package restaurantservice;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Table
 *
 */
@Entity

public class TableItem implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="tableitem_id")
	Integer id;
	List<Order> orders;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	private static final long serialVersionUID = 1L;

	public TableItem() {
		super();
	}
   
}
