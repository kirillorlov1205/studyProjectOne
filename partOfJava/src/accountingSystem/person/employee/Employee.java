package accountingSystem.person.employee;

import accountingSystem.person.Person;
import accountingSystem.person.StatusOfPerson;

import java.util.Random;

public abstract class Employee extends Person {

	private String firstName;
	private String lastName;
	private IdCard idCard;

	private StatusOfPerson statusOfPerson;

	public Employee() {
	}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.statusOfPerson = StatusOfPerson.OUT_OF_OFFICE;
		// TODO: 9/14/2021 According requirements IdCard must be set in Journal [Pavel.Chachotkin]
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

	// TODO: 9/14/2021  Why template for IdCard placed here? [Pavel.Chachotkin]
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

		// TODO: 9/14/2021 What this method must do? [Pavel.Chachotkin]
		//	test
		public void setIdCard(String id) {
			this.id = id;
		}
	}

}
