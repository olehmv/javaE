package epam.course.java.coffeepoint;

public enum Pay {
	
	Cash,Card,Bonus;
	
	public String toString() {
		switch (this) {
		case Cash:
			return "Cash";
		case Card:
			return "Card";
		case Bonus:
			return "Bonus";
		default:
			return "Free";
		}

	}

}
