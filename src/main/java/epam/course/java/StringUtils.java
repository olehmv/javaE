package epam.course.java;

import java.util.Arrays;

public class StringUtils {

	public static void main(String[] args) {
		System.out.println(replaceSeq("maamaaaaaaaammmmmmmmmmm ----- ffff aaaarrrr"));
		System.out.println(Arrays.toString(transform("java")));
		BWT b = new BWT();
		b.burrowsWheelerTransform("java");
		System.out.println(b.burrowsWheelerTransformReverse());
	}

	/**
	 * filter two or more sequence of the same character
	 * 
	 * @param String text
	 */
	public static String replaceSeq(String text) {
		char[] charArray = text.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < charArray.length - 1; i++) {
			// append only character which are difference from next
			if (charArray[i] != charArray[i + 1]) {
				builder.append(charArray[i]);
			}
		}
		builder.append(charArray[charArray.length - 1]);
		return builder.toString();
	}

	/**
	 * transform word to the same word with first character append to the end of
	 * word
	 * 
	 * @param String word
	 * @return String [] of transform words
	 */
	public static String[] transform(String word) {
		String[] arr = new String[word.length()];
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(0);
			word = word.substring(1) + c;
			arr[i] = word;
		}
		return arr;
	}
}
// String str = String.join(" ", result);
