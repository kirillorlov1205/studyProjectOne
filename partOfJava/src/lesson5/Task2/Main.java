package lesson5.Task2;

public class Main {
	//-- Задача 2 --
//Написать свой класс описывающий Стул.
// У стула должны быть вложенные классы Ножки,
// Спинка, Седушка. Ножки, спинка и седушка
// существовать отдельно от объекта класса не
// могут (Описываем стул в квартире)
	public static void main(String[] args) {
		//    Test
		Chair chair = new Chair();

		Chair.Legs leg = chair.new Legs(1, true);
		leg.legBreak();

		Chair.Backrest backrest = chair.new Backrest();
		backrest.makeBackDown();
		backrest.makeBackUp();

		Chair.Seat seat = chair.new Seat();
		seat.makeSeatDown();
		seat.makeSeatUp();

	}
}
