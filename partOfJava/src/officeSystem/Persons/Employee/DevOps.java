package officeSystem.Persons.Employee;

import officeSystem.Persons.StatusOfPerson;
import officeSystem.Persons.Vip;

public class DevOps extends Employee implements Vip {

	public DevOps(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}

	@Override
	public void turnOnTheHandleOf123Room() {
		System.out.println("Дверь комнты 123 открыта");
	}
}
