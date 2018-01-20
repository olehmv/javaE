package epam.course.java.coffeepoint;

public class OutOfItemsException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage(){
		return "No more items left";
	}
}
