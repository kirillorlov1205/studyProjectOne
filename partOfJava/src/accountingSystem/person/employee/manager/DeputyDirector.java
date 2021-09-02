package accountingSystem.person.employee.manager;

import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.Vip;

public class DeputyDirector extends Manager implements Vip {

	public DeputyDirector(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}

	@Override
	public void turnOnTheHandleOf123Room() {
		System.out.println("Дверь комнаты 123 открыта");
	}
}
