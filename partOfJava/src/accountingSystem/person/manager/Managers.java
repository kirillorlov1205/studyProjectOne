package accountingSystem.person.manager;

import accountingSystem.person.employee.Employee;
import accountingSystem.person.StatusOfPerson;

public abstract class Managers extends Employee {

	public Managers(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}
}
