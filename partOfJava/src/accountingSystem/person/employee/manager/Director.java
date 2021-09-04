package accountingSystem.person.employee.manager;

import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.Vip;

public class Director extends Manager implements Vip {

	public Director(String fName, String lName) {
		super(fName, lName);
	}

	@Override
	public void turnOnTheHandleOf123Room() {
		System.out.println("Дверь комнаты 123 открыта");
	}
}
