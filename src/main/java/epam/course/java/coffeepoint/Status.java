package epam.course.java.coffeepoint;

public enum Status {
	
	Open,Close;
	public String toString() {
		switch (this) {
		case Open:
			return "Open";
		case Close:
			return "Close";
		default:
			return "Close";
		}

	}

}
