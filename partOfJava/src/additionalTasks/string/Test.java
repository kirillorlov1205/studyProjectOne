package additionalTasks.string;

import java.util.ArrayList;

public class Test {
	public static void main(java.lang.String[] args) {
		String.splitTextToSentence("Hello my lil bro. This is a good day by the way.");
		String.splitTextToSentenceBySpace("Hello my lil bro. This is a good day by the way.");
		ArrayList<java.lang.String> list = new ArrayList<>();
		list.add("Hello");
		list.add(" My name is Mike");
		list.add(" I'm 20 years old");

		System.out.println(String.changeListToSentence(list));
	}
}
