package restaurantentities;

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
	private Integer id;
	private String feedback;
	private Integer rating;
	
	private static final long serialVersionUID = 1L;

	public Feedback() {
		super();
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	
   
}
