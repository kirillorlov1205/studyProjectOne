package accountingSystem.person.employee;

import accountingSystem.person.Person;
import accountingSystem.person.StatusOfPerson;

import java.util.Random;

public abstract class Employee extends Person {

	private String firstName;
	private String lastName;
	private IdCard idCard;

	private StatusOfPerson statusOfPerson;

	// TODO: 9/7/2021 For what this constructor [Pavel.Chachotkin]
	public Employee() {
	}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.statusOfPerson = StatusOfPerson.OUT_OF_OFFICE;
		idCard = new IdCard();
	}

	@Override
	public String toString() {
		return "Employee{ " +
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

	public IdCard getIdCard() {
		return idCard;
	}

	public StatusOfPerson getStatusOfPerson() {
		return statusOfPerson;
	}

	public void setStatusOfPerson(StatusOfPerson statusOfPerson) {
		this.statusOfPerson = statusOfPerson;
	}

	// TODO: 9/7/2021 Why this class placed here? [Pavel.Chachotkin]
	public class IdCard {
		private String id;

		public IdCard() {
			Random random = new Random();
			id = Double.toString(random.nextDouble()).substring(0, 10);
		}

		public String getId() {
			return id;
		}

		@Override
		public String toString() {
			return "IdCard{" +
					"id='" + id + '\'' +
					'}';
		}

		//	test
		public void setIdCard(String id) {
			this.id = id;
		}
	}

}
