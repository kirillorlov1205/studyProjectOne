package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Main {

	public static ArrayList<String> firstStream (ArrayList<String> arrayList){
		arrayList.stream()
				.filter(elementOfStream -> elementOfStream.contains("ser"))
				.sorted((p1, p2) -> p1.length() - p2.length())
				.forEach(System.out::println);
		return arrayList;
	}


	public static void main(String[] args) {
//1. Написать метод, который будет принимать
// в качестве параметра коллекцию строк типа ЭррэйЛист
//Метод должен вернуть коллекцию типа лист
// убрав из нее все строки содержащие подстроку
// "ser". Также все элементы новой коллекции
// должны быть упорядочены по длине строки


//	3 Создать класс Price с одним поле value.
//Написать метод, который будет принимать в качестве параметра коллекцию телефонов типа
// ЭррэйЛист (Класс телефон из лекции)
//Метод должен вернуть новую коллекцию. Коллекция будет содержать элементы класса Price.
// Соответственно метод должен вернуть коллекцию цен на телефоны.
// Цены должны быть отсортированы в соответствии с длинной названий моделей телефонов
//Вход : Phone("BB", 100), Phone("CCC", 200), Phone("A", 150)
//Вывод : Price (150), Price(100), Price(200)

		ArrayList<String> strings = new ArrayList<>();
		Collections.addAll(strings, "Kirill", "Orlov", "sersdfsdf", "sers");
//		System.out.println(firstStream(strings));
	}


}


