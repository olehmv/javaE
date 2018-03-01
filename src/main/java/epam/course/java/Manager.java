package epam.course.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	private List<Employee>list=new ArrayList<>();
	
	public Employee findMaxExpirienceEmpl() {
		Employee empl=list.get(0);
		for(Employee e:list) {
			if(empl.getExperience()>e.getExperience())
			empl=e;
		}
		return empl;
	}
	public Employee findMaxPaymentEmpl() {
		Employee empl=list.get(0);
		for(Employee e:list) {
			if(empl.getPayment()>e.getPayment())
			empl=e;
		}
		return empl;
	}
	public void writeToFile() {
		for(Employee e:list) {
			try {
				FileOutputStream f = new FileOutputStream(new File("employee.txt"));
				ObjectOutputStream o = new ObjectOutputStream(f);

				// Write objects to file
				o.writeObject(e);

				o.close();
				f.close();

			} catch (IOException ex) {
				System.out.println("Error initializing stream");
			}
		}
	}
	public List <Employee> readFromFile() {
		List <Employee>list=new ArrayList<>();
			try {
				FileInputStream fi = new FileInputStream(new File("employee.txt"));
				ObjectInputStream oi = new ObjectInputStream(fi);
				Employee ob1 = (Employee) oi.readObject();
				list.add(ob1);
				oi.close();
				fi.close();
			} catch (IOException ex) {
				System.out.println("Error initializing stream");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
}
