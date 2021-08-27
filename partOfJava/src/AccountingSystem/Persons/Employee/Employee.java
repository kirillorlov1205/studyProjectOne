package AccountingSystem.Persons.Employee;

import AccountingSystem.Persons.Persons;
import AccountingSystem.Persons.StatusOfPerson;

import java.util.Random;

public class Employee extends Persons {

	private String firstName;
	private String lastName;
	private IdCard idCard;

	private StatusOfPerson statusOfPerson;

	public Employee(String firstName, String lastName, StatusOfPerson statusOfPerson) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.statusOfPerson = statusOfPerson;
		idCard = new IdCard();
	}
//
	public Employee() {
	}

	public class IdCard {
		private final String id;

		public IdCard() {
			int leftLimit = 48;
			int rightLimit = 122;
			int targetStringLength = 10;
			Random random = new Random();

			id = random.ints(leftLimit, rightLimit + 1)
					.filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
					.limit(targetStringLength)
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
					.toString();
		}

		public String getId() {
			return id;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
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
