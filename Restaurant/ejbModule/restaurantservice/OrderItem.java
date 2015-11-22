package restaurantservice;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderItem
 *
 */
@Entity

public class OrderItem implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="orderitem_id")
	Integer id;
	Food food;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	Integer count;
	
	private static final long serialVersionUID = 1L;

	public OrderItem() {
		super();
	}
   
}
