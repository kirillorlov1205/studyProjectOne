package additionalTasks.stream.secondTask;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		Collections.addAll(strings, "kirierie", "dfsfd", "sfdsdf");

		System.out.println(SecondTask.secondTask(strings));
	}

}