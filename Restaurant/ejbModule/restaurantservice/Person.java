package restaurantservice;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
public class Person implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="person_id")
	private Integer id;
	private String userName;
	private String password;
	private String name;
	private String address;
	private String phone;
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
   
}