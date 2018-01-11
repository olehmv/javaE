package epam.course.java;

import java.util.Arrays;
import java.util.Comparator;

//https://en.wikipedia.org/wiki/Burrows%E2%80%93Wheeler_transform
// make a list of all rotation, sort them, take last column
//https://www.youtube.com/watch?v=4n7NPk5lwbI
public class StringUtils {

	public static void main(String[] args) {
		System.out.println(replaceSeq("maamaaaaaaaammmmmmmmmmm ----- ffff   aaaarrrr"));
		System.out.println(Arrays.toString(transform("java")));
		System.out.println(Arrays.toString(burrowsWheelerTransform("Burrows_Wheeler_transform")));
	}

	public static String replaceSeq(String line) {
		char[] charArray = line.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] != charArray[i + 1]) {
				builder.append(charArray[i]);
			}
		}
		builder.append(charArray[charArray.length - 1]);
		return builder.toString();
	}

	public static String[] transform(String word) {
		String[] arr = new String[word.length()];
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(0);
			word = word.substring(1) + c;
			arr[i] = word;
		}
		return arr;
	}

	public static String[] burrowsWheelerTransform(String word) {
		Comparator<String> c = (String a, String b) -> a.compareTo(b);
		String[] strings = transform(word);
		Arrays.sort(strings, c);
		StringBuilder builderFirst = new StringBuilder();
		StringBuilder builderLast = new StringBuilder();
		for (String string : strings) {
			builderFirst.append(string.charAt(0));
			builderLast.append(string.charAt(string.length() - 1));
		}

		return new String[] { builderFirst.toString(), builderLast.toString() };
	}

	public static String burrowsWheelerTransformReverse(String first, String last) {
		StringBuilder builder = new StringBuilder();

		return builder.toString();
	}
}
