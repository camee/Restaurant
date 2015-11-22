package restaurantservice;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Feedback
 *
 */
@Entity

public class Feedback implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="feedback_id")
	Integer id;
	String feedback;
	Integer rating;
	
	private static final long serialVersionUID = 1L;

	public Feedback() {
		super();
	}
   
}
