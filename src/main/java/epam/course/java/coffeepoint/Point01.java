package epam.course.java.coffeepoint;

public class Point01 {

	public static void main(String[] args) {
		CoffeePoint point01 = new CoffeePoint().addLogo("Coffee Break")
				.addItems(Genesis.Coffee, 10, "Black coffee", 100, 1).addItems(Genesis.Milk, 5, "Hot Milk", 50, 1)
				.addItems(Genesis.Chocolade, 10, "Hot Chocolade", 50, 1).addItems(Genesis.Sugar, 1, "Sugar stick", 5, 1)
				.addItems(Genesis.Cream, 2, "Coffee cream", 10, 1);
		System.out.println("*******************************************************************");
		System.out.println(point01.showItems());

		try {
			Order newOrder01 = point01.newOrder(Pay.Cash, point01.getItem("Black coffee"))
					.addItem(point01.getItem("Hot Milk")).addItem(point01.getItem("Sugar stick"))
					.addItem(point01.getItem("Hot Chocolade"));

			System.out.println("*******************************************************************");
			System.out.println(newOrder01);
			System.out.println("*******************************************************************");
			Order newOrder02 = point01.newOrder(Pay.Cash, point01.getItem("Black coffee"));
		} catch (OutOfItemsException e) {
			e.printStackTrace();
		}
	}

}
