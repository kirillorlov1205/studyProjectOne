package accountingSystem.person.manager;

import accountingSystem.person.employee.Employee;
import accountingSystem.person.StatusOfPerson;

public abstract class Manager extends Employee {

	public Manager(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}
}
