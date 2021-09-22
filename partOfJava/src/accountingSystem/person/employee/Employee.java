package accountingSystem.person.employee;

import accountingSystem.Journal;
import accountingSystem.person.Person;
import accountingSystem.person.StatusOfPerson;

import java.util.Objects;

public abstract class Employee extends Person {

	private String firstName;
	private String lastName;
	private Journal.IdCard idCard;

	private StatusOfPerson statusOfPerson;

	public Employee() {
	}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.statusOfPerson = StatusOfPerson.OUT_OF_OFFICE;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " { " +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", idCard=" + idCard +
				", statusOfPerson=" + statusOfPerson +
				'}' + "\n";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Journal.IdCard getIdCard() {
		return idCard;
	}

	public StatusOfPerson getStatusOfPerson() {
		return statusOfPerson;
	}

	public void setStatusOfPerson(StatusOfPerson statusOfPerson) {
		this.statusOfPerson = statusOfPerson;
	}

	public void setIdCard(Journal.IdCard idCard) {
		this.idCard = idCard;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
	}
}
