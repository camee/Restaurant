package restaurantentities;

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
	private Integer id;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity = Order.class, mappedBy = "table")
	private List<Order> orders;
	
	private Integer seats;
	
	private static final long serialVersionUID = 1L;

	public TableItem() {
		super();
	}
	
	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

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
}
