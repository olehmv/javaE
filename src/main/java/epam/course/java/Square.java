package epam.course.java;

public class Square {
	private double x;
	private double y;
	private double width;
	
	
	public Square() {
		super();
	}
	public Square(double x, double y, double width) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
	}
	public double getPerimeter() {
		return 4*width;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Square [x=" + x + ", y=" + y + ", width=" + width + "]";
	}
	
	

}
