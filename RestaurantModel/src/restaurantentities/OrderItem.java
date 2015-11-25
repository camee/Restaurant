package restaurantentities;

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
	private Integer id;
	
//	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//	@JoinColumn(name ="food_id", referencedColumnName="food_id")
//	private Food food;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name ="order_id", referencedColumnName="order_id")
	private Order order;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
//
//	public Food getFood() {
//		return food;
//	}
//
//	public void setFood(Food food) {
//		this.food = food;
//	}

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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
   
}
