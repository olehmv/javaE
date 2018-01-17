package epam.course.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

//Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
public class Generic {
	
	public static void main(String[] args) {
	  	List<Integer>l=new ArrayList<>();
	  	l.add(3);
	  	l.add(7);
	  	l.add(10);
	  	List<String>ll=new ArrayList<>();
	  	ll.add("pop");
	  	ll.add("hi");
	  	generic(l,s->s / s == 1 && s%2!=0 && s%3!=0);
	  	

	}

	public static <T> int generic(Collection<T> c, Predicate<T> t) {
		int count=0;
		for (T n : c) {
			boolean test = t.test(n);
			if(!test)count++;
		}
		return count;
	}
	class OddPredicate implements Predicate<Integer> {
		   public boolean test(Integer i) { return i % 2 != 0; }
	}
	class PrimePredicate implements Predicate<Integer> {
		   public boolean test(Integer i) { 
			   return i / i == 1 && i%2!=0 && i%3!=0; }
	}
	class PolindromPredicate implements Predicate<String> {
		   public boolean test(String s) { 
			   
			   
			   return true;
			   }
	}

}

//for (T t1 : t) {
//	char [] array = t1.toString().toCharArray();
//	int i=0;
//	
//}
//
//return 0;