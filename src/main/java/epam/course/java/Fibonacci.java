package epam.course.java;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 5;
		while (i > 0) {
			System.out.println(fib(i));
			i--;
		}

		int a[] = { 1, 3, 4, 5, 6, 7, 8, 9, 2, 10 };
		selectionSort(a);
		System.out.println(Arrays.toString(a));
		evenOdd(a);
		reminder(a);
	}

	public static int fib(int n) {
		if (n == 0)
			return 0;
		if (n <= 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	public static void selectionSort(int... a) {

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}

	public static void evenOdd(int... a) {
		for (int i : a) {
			if (i % 2 == 0) {
				System.out.println("Even " + i);
			} else {
				System.out.println("Odd " + i);
			}
		}
	}

	public static void reminder(int... a) {
		int result = 0;
		for (int i = 1; i < a.length; i++) {
			int r1 = a[i];
			int r2 = a[i - 1];
			result = a[i] / a[i - 1];
			System.out.println(result);
		}
	}
}
