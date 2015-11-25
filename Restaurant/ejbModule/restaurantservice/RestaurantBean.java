package restaurantservice;

import java.util.Calendar;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import restaurantentities.Feedback;
import restaurantentities.Food;
import restaurantentities.Order;
import restaurantentities.OrderItem;
import restaurantentities.Person;
import restaurantentities.TableItem;

/**
 * Session Bean implementation class RestaurantBean
 */
@Stateless
@LocalBean
@ManagedBean(name = "restaurant")
@RequestScoped
public class RestaurantBean implements RestaurantBeanRemote, RestaurantBeanLocal {

	@EJB
	PersonService personservice;
	Person person = new Person();

	@EJB
	FoodService foodservice;
	Food food = new Food();

	@EJB
	OrderService orderservice;
	Order order = new Order();

	@EJB
	OrderItemService orderitemservice;
	OrderItem orderitem = new OrderItem();

	@EJB
	FeedbackService feedbackservice;
	Feedback feedback = new Feedback();

	@EJB
	TableItemService tableservice;
	TableItem table = new TableItem();

	/**
	 * Default constructor.
	 */
	public RestaurantBean() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		// person.setUserName("bogyo");
		food.setName(name);
		foodservice.create(food);
		System.out.println("Itt vagyunk a setname-ben");
	}

	public void createFood(String name, Integer price) {
		food.setName(name);
		food.setPrice(price);
		foodservice.create(food);
		System.out.println("Itt vagyunk a createFoodban");
	}

	public Person helloPerson(Person person) {
		this.person = person;
		personservice.create(person);
		System.out.println("Itt vagyunk a hellopersonban");
		return this.person;
	}

	public Food helloFood(Food food) {
		this.food = food;
		foodservice.create(food);
		System.out.println("Itt vagyunk a helloFoodban");
		return this.food;
	}

	public String getRole(String username) {
		Person person2 = personservice.findByUsername(username);
		if (!person2.equals(null)) {
			return person.getRole();
		}
		return null;
	}

	public void createFeedback(String feedback, Integer rating) {
		Feedback feedback2 = new Feedback();
		feedback2.setFeedback(feedback);
		feedback2.setRating(rating);
		feedbackservice.create(feedback2);
	}

	public boolean login(String username, String password) {
		Person person2 = personservice.login(username, password);
		if (!person2.equals(null)) {
			return true;
		}
		return false;
	}

	public List<Order> getOrders() {									//csak amik username-et tartalmaznak
		List<Order> orders = orderservice.findAll();
		for (Order order : orders) {
			if(order.getPerson().getUserName().equals(null)){
				orders.remove(order);
			}
		}
		return orders;
	}

	public String createReservation(Calendar date, Integer seats, String username) {
		Order order2 = new Order();
			order2.setDate(date);
		Person person2 = personservice.findByUsername(username);
		if (person2.equals(null)) {
			return "A felhasználónév nem létezik.";
		}
			order2.setPerson(person2);

		TableItem table2 = null;
		for (int i = 0; i <= (8 - seats) & table2.equals(null); i++) {
			table2 = tableservice.findFreeTable(seats, seats + i, date);
		}
		if(table2.equals(null)){
			return "Nincs szabad asztal a megadott idõpontban.";
		}
		else{
			order2.setTable(table2);
		}
		orderservice.create(order2);
		return "A foglalás megtörtént.";
	}

	public String deleteReservation(Integer id) {
		Order order2 = orderservice.find(id);
		if (!order2.equals(null)) {
			orderservice.remove(order2);
			return "A rendelés törölve";
		}
		return "A rendelés nem található";
	}
}
