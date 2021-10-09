package additionalTasks.stream.secondTask;

import java.util.ArrayList;

public class SecondTask {

	public static String secondTask(ArrayList<String> stringArrayList) {
		String result = stringArrayList.stream()
				.filter(s -> s.contains("var"))
				.findFirst()
				.orElse("No elements");
		return result;
	}
}
