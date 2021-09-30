package Stream.firstTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstTask {
	public static List<String> firstStream(ArrayList<String> arrayList) {
		return arrayList.stream()
				.filter(elementOfStream -> !elementOfStream.contains("ser"))
				.sorted((p1, p2) -> p1.length() - p2.length())
				.collect(Collectors.toList());
	}

}
