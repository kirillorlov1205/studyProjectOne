package AccountingSystem.Persons.Employee;

import AccountingSystem.IdCard;
import AccountingSystem.Persons.Persons;
import AccountingSystem.Persons.StatusOfPerson;

public class Employee extends Persons {

	private String fName;
	private String lName;
	private IdCard idCard;

	private StatusOfPerson statusOfPerson;

	public Employee(String fName, String lName, StatusOfPerson statusOfPerson) {
		this.fName = fName;
		this.lName = lName;
		this.statusOfPerson = statusOfPerson;
		idCard = new IdCard();
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public StatusOfPerson getStatusOfPerson() {
		return statusOfPerson;
	}

	public void setStatusOfPerson(StatusOfPerson statusOfPerson) {
		this.statusOfPerson = statusOfPerson;
	}

}
