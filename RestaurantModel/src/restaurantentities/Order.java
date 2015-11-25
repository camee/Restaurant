package restaurantentities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

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
	private Integer id;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity = OrderItem.class, mappedBy = "order")
	private List<OrderItem> orderItems;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
	@JoinColumn(name ="person_id", referencedColumnName="person_id")
	private Person person;
	
	private Calendar date;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
	@JoinColumn(name ="tableitem_id", referencedColumnName="tableitem_id")
	private TableItem table;
	
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
