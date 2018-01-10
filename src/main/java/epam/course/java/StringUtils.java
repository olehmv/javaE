package epam.course.java;

//https://en.wikipedia.org/wiki/Burrows%E2%80%93Wheeler_transform
//https://stackoverflow.com/questions/18289325/finding-a-repeated-character-in-a-string
public class StringUtils {

	public static void main(String[] args) {
		System.out.println(replaceSeq("maama11mm"));
	}

	public static String replaceSeq2(String line) {
		char[] charArray = line.toCharArray();
		StringBuilder builder=new StringBuilder();
		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i-1] != charArray[i]) {
				builder.append(charArray[i-1]);
			}
		}
		builder.append(charArray[charArray.length-1]);
		return builder.toString();
	}
	
	public static String replaceSeq(String line) {
		char[] charArray = line.toCharArray();
		StringBuilder builder=new StringBuilder();
		int ch=0;
		int count=0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i-1] == charArray[i]) {
				count++;
			}
			if(count=>2) {
				
			}
		}
		builder.append(charArray[charArray.length-1]);
		return builder.toString();
	}
}
// Stream<char[]> distinct =
// Arrays.asList(string.toCharArray()).stream().distinct();
// collect = distinct.collect(Collectors.toList());
// Stream<char[]> distinct =
// Arrays.asList(string.toCharArray()).stream().distinct();
// collect = distinct.collect(Collectors.toList());
// String s = Arrays.toString(string.chars().distinct().toArray());