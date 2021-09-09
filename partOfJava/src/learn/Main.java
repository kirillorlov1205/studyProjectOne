package learn;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
//а) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
//б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
//в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.

//	List<String> names = new ArrayList<>();
//        names.add("Snoopy");
//        names.add("Charlie");
//        names.add("Linus");
//        names.add("Shroeder");
//        names.add("Woodstock");
//
//        for(String name : names){
//		System.out.println(name);


	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Kirill");
		names.add("Donny");
		names.add("Carl");


		String [] arr = new String[]{"Kirilllll", "Tonny", "Tonny1"};
		names.addAll(Arrays.asList(arr));

		for(String i: names){
			System.out.println(i);
		}
//
//		int[] arr = new int[]{1,2,3,4,4,5,6};
//
//		for (int num : arr
//			 ) {
//			System.out.println(num);
//		}

	}

}

