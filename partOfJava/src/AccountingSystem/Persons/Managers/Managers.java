package AccountingSystem.Persons.Managers;

import AccountingSystem.Persons.Employee.Employee;
import AccountingSystem.Persons.StatusOfPerson;

public abstract class Managers extends Employee {

	public Managers(String fName, String lName, StatusOfPerson statusOfPerson) {
		super(fName, lName, statusOfPerson);
	}
}
