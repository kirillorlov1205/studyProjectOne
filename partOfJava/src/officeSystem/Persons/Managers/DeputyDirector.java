package officeSystem.Persons.Managers;

import officeSystem.Persons.StatusOfPerson;
import officeSystem.Persons.Vip;

public class DeputyDirector extends Managers implements Vip {

	public DeputyDirector(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}

	@Override
	public void turnOnTheHandleOf123Room() {
		System.out.println("Дверь комнаты 123 открыта");
	}
}
