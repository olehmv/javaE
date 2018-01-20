package epam.course.java.coffeepoint;


//- зреалізувати кофепоінт (такий як в бізнесцентрі біля нас :slightly_smiling_face: ).
//Кофепоінт може продавати каву. Каву з молоком, каву з молоком і вершками. 
//Каву з молоком і вершками і шоколадом. Каву з вершками з шоколадом. Каву з вершками. 
//Тобто можуть бути різні варіації. Також може продавати хотдоги і сендвічі додатково до кави. 
//Клієнт може розплачуватись готівкою чи карткою, чи отримувати безкоштовно, за бонуси. 
//Ну і замовляти всяке різне
public enum Genesis {
	
	Coffee,Milk,Sugar,Cream,Chocolade;
	
	public String toString() {
		switch (this) {
		case Coffee:
			return "Coffee";
		case Milk:
			return "Milk";
		case Sugar:
			return "Sugar";
		case Cream:
			return "Cream";
		case Chocolade:
			return "Chocolade";
		default:
			return "Coffee";
		}

	}

}
