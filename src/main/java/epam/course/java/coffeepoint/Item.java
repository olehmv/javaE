package epam.course.java.coffeepoint;

public class Item {
	private Genesis genesis;
	private long price;
	private String description;
	private int size;
	private Status status=Status.Open;
	
	@Override
	public String toString() {
		return "Item genesis = " + genesis + ", price = " + price + ", description = " + description + ", size = " + size
				+ ", status = " + status + "\n";
	}

	public Item build(int size) {
		this.size=size;
		return this;
	}
	
	public Item build(Genesis genesis) {
		this.genesis=genesis;
		return this;
	}
	public Item build(long price) {
		this.price=price;
		return this;
	}
	public Item build(String description) {
		this.description=description;
		return this;
	}
	public Genesis getGenesis() {
		return genesis;
	}
	public long getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}

	public int getSize() {
		return size;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
