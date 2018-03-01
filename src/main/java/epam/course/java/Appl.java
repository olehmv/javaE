package epam.course.java;

public class Appl {

	public void work() {
		Square square = new Square();
		square.setWidth(10);
		square.setX(18);
		square.setY(23);
		System.out.println("Coordinate:"+"x: "+square.getX()+"y: "+square.getY());
		System.out.println(square.getPerimeter());
	}
}
