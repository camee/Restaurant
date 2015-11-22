package restaurantservice;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity
@Table(name="Orders")
public class Order implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="order_id")
	Integer id;
	List<OrderItem> orderItems;
	Person person;
	Calendar date;
	TableItem table;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public TableItem getTable() {
		return table;
	}

	public void setTable(TableItem table) {
		this.table = table;
	}

	private static final long serialVersionUID = 1L;

	public Order() {
		super();
	}
   
}
