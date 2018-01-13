package epam.course.java;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://en.wikipedia.org/wiki/Burrows%E2%80%93Wheeler_transform.
 * https://www.youtube.com/watch?v=4n7NPk5lwbI
 * 
 * @author Oleh
 */
public class BWT {

	private int indexOfOriginalText;
	private StringBuilder builderfirstColumnOfMatrix;
	private StringBuilder builderlastColumnOfMatrix;

	/**
	 * transform text to firstColumnOfMatrix and lastColumnOfMatrix columns of
	 * Burrows Wheeler Transform
	 * 
	 * @param String text
	 */
	public void burrowsWheelerTransform(String text) {
		System.out.println("\nTRANSFORM OPERATION");
		Comparator<String> c = (String a, String b) -> a.compareTo(b);
		String[] strings = StringUtils.transform(text);
		Arrays.sort(strings, c);
		System.out.println("\n>Transform text : "+ text +"\nto array\n"+Arrays.toString(strings));
		indexOfOriginalText = Arrays.asList(strings).indexOf(text);
		System.out.println("\n>Set Array Index of original text to <<<"+indexOfOriginalText+">>>"
				+ "\nThis Index will be used in reverse transformation");
		builderfirstColumnOfMatrix = new StringBuilder();
		builderlastColumnOfMatrix = new StringBuilder();
		for (String string : strings) {
			builderfirstColumnOfMatrix.append(string.charAt(0));
			builderlastColumnOfMatrix.append(string.charAt(string.length() - 1));
		}
		System.out.println("\n>Set First column of Matrix to"
				+ "\n"+builderfirstColumnOfMatrix.toString());
		System.out.println("\n>Set Last column of Matrix to"
				+ "\n"+builderlastColumnOfMatrix.toString());
		System.out.println("\n>Transformed Matrix : "+Arrays.toString(strings));
	}

	/**
	 * reserve to original text from firstColumnOfMatrix and lastColumnOfMatrix
	 * columns of Burrows Wheeler Transform
	 * @return  String original text
	 */
	public String burrowsWheelerTransformReverse() {
		System.out.println("\nREVERSE OPERATION");
		String firstColumnOfMatrix = builderfirstColumnOfMatrix.toString();
		String lastColumnOfMatrix = builderlastColumnOfMatrix.toString();
		System.out.println("\n>Reverse to original text from : \nfirstColumnOfMatrix : "+firstColumnOfMatrix+""
				+ "\nlastColumnOfMatrix :"+lastColumnOfMatrix);
		int length = firstColumnOfMatrix.length();
		Comparator<String> c = (String a, String b) -> a.compareTo(b);
		String[] result = new String[length];
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length; j++) {
				char sChar = lastColumnOfMatrix.charAt(j);
				if (i == 0) {
					char fChar = firstColumnOfMatrix.charAt(j);
					result[j] = String.valueOf(sChar).concat(String.valueOf(fChar));
					System.out.println("\n>Add last and first elements"
							+ "\n"+fChar+"+"+sChar+"="+result[j]);
				} else {
					result[j] = String.valueOf(sChar).concat(result[j]);
					System.out.println("\n>append last "+"\'"+sChar+"\'"+" element to elements from result array"
							+ "\n"+result[j]);
				}
			}

			Arrays.sort(result, c);
			System.out.println("\n>Sort array :"
					+"\n"+Arrays.toString(result));
		}
		System.out.println("\n>Get original text by index <<<"+indexOfOriginalText+">>> "+result[indexOfOriginalText]);
		System.out.println("\nReturn result :");
		return result[indexOfOriginalText];
	}

	public int getIndexOfOriginalText() {
		return indexOfOriginalText;
	}

	public StringBuilder getBuilderfirstColumnOfMatrix() {
		return builderfirstColumnOfMatrix;
	}

	public StringBuilder getBuilderlastColumnOfMatrix() {
		return builderlastColumnOfMatrix;
	}
}
