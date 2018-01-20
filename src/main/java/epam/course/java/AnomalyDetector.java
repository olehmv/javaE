package epam.course.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

//Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
public class AnomalyDetector{

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("A nut for a jar of tuna", "Amore, Roma.", "Not a palindrome","Yo, banana boy!");
		Predicate<Integer> oddNumber = n -> isOddNumber(n);
		Predicate<Integer> primeNumber = n -> isPrimeNumber(n);
		Predicate<String> palindrome = s -> isPalindrom(s);
		System.out.println(genericTesterCount(findPrimeNumbers(7919), oddNumber));
		System.out.println(genericTesterCount(findPrimeNumbers(7919), primeNumber));
		System.out.println(genericTesterCount(strings, palindrome));
	
	}

	public static <T> int genericTesterCount(Collection<T> c, Predicate<T> t) {
		int count = 0;
		for (T n : c) {
			boolean test = t.test(n);
			if (test)
				count++;
		}
		return count;
	}

	public static boolean isOddNumber(int n) {
		return n % 2 != 0;
	}

	public static boolean isPrimeNumber(int n) {
		if (n == 1)
			return false;
		boolean isPrime = true;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return isPrime;
	}

	public static boolean isPalindrom(String text) {
		String[] sentences = text.split("[,.!?]");
		StringBuilder b = new StringBuilder();
		for (String s : sentences) {
			String[] words = s.split(" ");
			for (String w : words) {
				b.append(w.trim());
			}
		}
		String string1 = b.toString();
		String string2 = b.reverse().toString();
		return string1.equalsIgnoreCase(string2);
	}

	public static List<Integer> findPrimeNumbers(int n) {
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			if (isPrimeNumber(i)) {
				list.add(i);
			}
		}
		return list;
	}

}
