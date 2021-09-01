package accountingSystem.person.employee;

import accountingSystem.Journal;
import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.Vip;

public class DevOps extends Employee implements Vip {

	public DevOps(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}

	@Override
	public void turnOnTheHandleOf123Room() {
		System.out.println("Дверь комнты 123 открыта");
	}

}
