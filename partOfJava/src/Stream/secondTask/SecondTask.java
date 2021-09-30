package Stream.secondTask;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Optional;

public class SecondTask {

	//	2. Написать метод, который будет принимать в
//	качестве параметра коллекцию строк типа ЭррэйЛист
//Метод должен возвращать первый элемент
// который будет содержать подстроку "vor". Если
// такого элемента в коллекции не было метод должен
// вернуть строку "No elements"

// TODO: 9/30/2021 Прошу подсказать почему результ - optional null если я обрабатываю пустое значение
	public static String secondTask(ArrayList<String> stringArrayList) {
		String result = stringArrayList.stream()
				.filter(s -> s.contains("var"))
				.findFirst()
				.toString();
		Optional<String> optionalS = Optional.of(result);
		optionalS.ifPresentOrElse(
				System.out::println,
				() -> System.out.println("No elements"));
		return result;
	}
}
