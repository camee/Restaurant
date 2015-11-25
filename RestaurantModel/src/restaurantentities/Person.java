package restaurantentities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
public class Person implements Serializable {

	@Id
	@SequenceGenerator(name="my_seq_gen", sequenceName="PERSON_SEQ", initialValue=1000)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_seq_gen")
	@Column(name="person_id")
	private Integer id;
	@Column(unique = true)
	private String userName;
	private String password;
	private String name;
	private String address;
	private String phone;
	private String role;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity = Order.class, mappedBy = "person")
	private List<Order> orders;

	
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
   
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}