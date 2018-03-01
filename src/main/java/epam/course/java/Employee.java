package epam.course.java;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double payment;
	private int experience;
	public Employee(double payment, int experience) {
		super();
		this.payment = payment;
		this.experience = experience;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [payment=" + payment + ", experience=" + experience + "]";
	}
	
	

}
