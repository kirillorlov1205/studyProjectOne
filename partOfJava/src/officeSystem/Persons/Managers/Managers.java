package officeSystem.Persons.Managers;

import officeSystem.Persons.Employee.Employee;
import officeSystem.Persons.StatusOfPerson;

public abstract class Managers extends Employee {

	public Managers(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}
}
