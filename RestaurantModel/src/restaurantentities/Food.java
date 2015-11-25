package restaurantentities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Food
 *
 */

@Entity
public class Food implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="food_id")
	private Integer id;
	private String name;
	private Integer price;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	private static final long serialVersionUID = 1L;

	public Food() {
		super();
	}
   
}
