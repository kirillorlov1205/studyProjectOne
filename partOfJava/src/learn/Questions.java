package learn;
//Заметки для Кирилла
//
//-- + именование пакетов с маленькой буквы
//-- + не советовал бы жалеть букв на название переменных fName, вполне можно записывать как firstName
//-- + не по код конвеншену название метода getFirstName()
//-- + Можем ли мы создавать работников по классу Employee ?
//-- + Пэкеджинг не соответствует иерархии классов описанной на занятии
//-- + Нейминг в энаме StatusOfPerson не соответствует кодКонвеншену
//-- + В интерфейсах методы всегда паблик, поэтому модификатор доступа у метода turnOnTheHandleOf123Room() можно убрать
//-- + Комментариев в коде быть не должно, особенно таких как в классе IdCard
//-- + AccountingSystem.IdCard#id Переменная id может быть final
//-- + AccountingSystem/Journal.java:23 закоменнченых методов в коде быть не должно!
//-- +  AccountingSystem/Journal.java:45 Идея хайлайтит метод setStatusOfPerson(StatusOfPerson.INOFFICE); так как его нет в проекте
//-- + Класса Questions быть не должно. Вопросы или коммить отдельным файлом, или присылай в телеге.
//
//___________________________________________
////1.	todo: Лучше решения я не нашел, что можно использовать для генерации id с 10-ю цифрами ?
//
////		public IdCard() {
////		id = ThreadLocalRandom.current().nextLong(1000000000L,10000000000L);
////	}
//-- Найди более оптимальное решение с классом рандом https://www.baeldung.com/java-random-string, либо объясни для чего используешь класс ThreadLocalRandom. И прочитай ВНИМАТЕЛЬНО требования к айдишнику. (Подсказка, цифры тоже подходят, но не обязательно только ими ограничиваться)
//___________________________________________
////2.	 public  void  addToPersonArr(Employee employee) {
////		if (index > personsArr.length - 1) { //todo: хотел написать "personsArr[index] > personsArr.length"  - не работае, прошу объяснить
//
//Так а почему должно работать, ели ты пытаешься сравнить объект класса Employee и (его длинну -1). То есть объект класса и число. Конечно компилятор не знает что с этим делать
//
////			System.out.println("Out of limit of Persons");
////			return;
////		}else{
////			personsArr[index++] = employee;
////		}
////	}
//
//___________________________________________
////	3. todo: Еще рассказать про final
//https://javarush.ru/groups/posts/591-vot-tak-final


//todo: вложенный класс - айдикарт


public class Questions {

//1.	todo: Лучше решения я не нашел, что можно использовать для генерации id с 10-ю цифрами ?

//		public IdCard() {
//		id = ThreadLocalRandom.current().nextLong(1000000000L,10000000000L);
//	}

//2.	 public  void  addToPersonArr(Employee employee) {
//		if (index > personsArr.length - 1) { //todo: хотел написать "personsArr[index] > personsArr.length"  - не работае, прошу объяснить
//			System.out.println("Out of limit of Persons");
//			return;
//		}else{
//			personsArr[index++] = employee;
//		}
//	}
//	3. todo: Еще рассказать про final

}
