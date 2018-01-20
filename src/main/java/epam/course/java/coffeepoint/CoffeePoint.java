package epam.course.java.coffeepoint;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Coffee point holder
 * 
 * @author Oleh
 *
 * @param <T>
 */
public class CoffeePoint {
	private String logo;
	private List<Order> orders = new LinkedList<>();
	private Map<String,Item> items = new HashMap<>();
	private Item item;
	private Order order;

	public String showLogo() {
		return logo;
	}

	public Map<String,Item> showItems() {
		return items;
	}

	
	public CoffeePoint addItems(Genesis genesis,long price, String description,int size,int howMany) {
		for(int i=0;i<howMany;i++) {
			item=new Item();
			item = item.build(genesis).build(price).build(description).build(size);
			items.put(item.getDescription(),item);
		}
		return this;
	}
	public Order newOrder(Pay pay,Item item) {
		item.setStatus(Status.Close);
		order=new Order()
		.setPay(pay)
		.addItem(item);
		orders.add(order);
		return order;
	}
	public Order getOrder(Order order) {
		return orders.get(orders.indexOf(order));
	}
	public Item getItem(String description) throws OutOfItemsException {
		Item item = items.get(description);
		if(item.getStatus()==Status.Close) {
			throw new OutOfItemsException();
		}
		return items.get(description);
	}

	public CoffeePoint addLogo(String logo) {
		this.logo=logo;
		return this;
	}
	
}
