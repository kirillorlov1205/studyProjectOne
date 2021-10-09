package additionalTasks.Stream.thirdTask;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {

		ArrayList<Phone> phoneArrayList = new ArrayList<>();
		Collections.addAll(phoneArrayList, new Phone("Xiaomi", 200), new Phone("Nokia", 300));

		System.out.println(Phone.getAllPrice(phoneArrayList));
	}
}
