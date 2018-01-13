package epam.course.java;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StringAlignUtils extends Format {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8965193817747048046L;

	public static void main(String[] args) {
		String sampleText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt "
				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
				+ "nisi ut aliquip ex ea commodo consequat.";

		StringAlignUtils util = new StringAlignUtils(30, Align.RIGHT);
		System.out.println(util.format(sampleText));
	}

	public enum Align {
		RIGHT
	}

	private Align currentAlignment;
	private int maxChars;

	public StringAlignUtils(int maxChars, Align align) {
		switch (align) {
		case RIGHT:
			this.currentAlignment = align;
			break;
		default:
			throw new IllegalArgumentException();
		}
		this.maxChars = maxChars;
	}

	public StringBuffer format(Object input, StringBuffer where, FieldPosition ignore) {
		String s = input.toString();
		List<String> strings = splitInputString(s);
		ListIterator<String> listItr = strings.listIterator();

		while (listItr.hasNext()) {
			String wanted = listItr.next();
			switch (currentAlignment) {
			case RIGHT:
				pad(where, maxChars - wanted.length());
				where.append(wanted);
				break;
			}
			where.append("\n");
		}
		return where;
	}

	private final void pad(StringBuffer to, int howMany) {
		for (int i = 0; i < howMany; i++)
			to.append(' ');
	}

	private String format(String s) {
		return format(s, new StringBuffer(), null).toString();
	}

	private List<String> splitInputString(String str) {
		List<String> list = new ArrayList<String>();
		if (str == null)
			return list;
		for (int i = 0; i < str.length(); i = i + maxChars) {
			int endindex = Math.min(i + maxChars, str.length());
			list.add(str.substring(i, endindex));
		}
		return list;
	}

	@Override
	public Object parseObject(String source, ParsePosition pos) {
		return source;
	}
}