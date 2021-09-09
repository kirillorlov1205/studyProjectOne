package string;

import java.util.List;

public class String {

	public static void splitTextToSentence(java.lang.String text) {
		java.lang.String[] sentences = text.split("\\.");
		for (java.lang.String string : sentences
		) {
			System.out.println(string);
		}
	}

	public static void splitTextToSentenceBySpace(java.lang.String text) {
		java.lang.String[] sentences = text.split("\\s");
		for (java.lang.String string : sentences
		) {
			System.out.println(string);
		}
	}

	public static java.lang.String changeListToSentence(List<java.lang.String> list) {
		return java.lang.String.join(",", list);
	}


}
