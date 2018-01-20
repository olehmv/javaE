package epam.course.java.coffeepoint;

import java.util.LinkedList;
import java.util.List;


public class Order {
	private Pay pay;
	private List<Item> items = new LinkedList<>();
	private Status status=Status.Open;

	public Order remove(Item item) {
		
		items.remove(item);
		return this;
	}

	public Pay getPay() {
		return pay;
	}

	public List<Item> getItems() {
		return items;
	}

	public Order addItem(Item item) {
		item.setStatus(Status.Close);
		items.add(item);
		return this;
	}

	public Order setPay(Pay pay) {
		this.pay = pay;
		return this;
	}

	public long price() {
		return items.stream().mapToLong(i -> i.getPrice()).sum();
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order pay = " + pay + ", items = " + items + " price = "+price()+" status = " + status + "";
	}
	
	
}
