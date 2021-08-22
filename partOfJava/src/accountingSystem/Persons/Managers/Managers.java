package accountingSystem.Persons.Managers;

import accountingSystem.Persons.Employee.Employee;
import accountingSystem.Persons.StatusOfPerson;

public abstract class Managers extends Employee {

	public Managers(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}
}
