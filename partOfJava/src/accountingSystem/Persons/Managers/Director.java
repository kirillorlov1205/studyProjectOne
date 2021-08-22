package accountingSystem.Persons.Managers;

import accountingSystem.Persons.StatusOfPerson;
import accountingSystem.Persons.Vip;

public class Director extends Managers implements Vip {

	public Director(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}

	@Override
	public void turnOnTheHandleOf123Room() {
		System.out.println("Дверь комнаты 123 открыта");
	}
}
