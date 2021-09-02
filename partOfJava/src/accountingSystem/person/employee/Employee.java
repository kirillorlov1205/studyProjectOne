package accountingSystem.person.employee;

import accountingSystem.Journal;
import accountingSystem.person.Person;
import accountingSystem.person.StatusOfPerson;

import java.util.Random;

public abstract class Employee extends Person {

	private final String firstName;
	private final String lastName;
	private IdCard idCard;

	private StatusOfPerson statusOfPerson;

	// TODO: 9/1/2021 When I create user by default must be OUT_OF_OFFICE [Pavel.Chachotkin]
	public Employee(String firstName, String lastName, StatusOfPerson statusOfPerson) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.statusOfPerson = statusOfPerson;
		idCard = new IdCard();
	}

	public void enterToOffice(Journal journal) {
		for (int i = 0; i < journal.getAllPerson().length - 1; i++) { // TODO: 9/1/2021 Check this loop for adding 15 persons [Pavel.Chachotkin]
			if (journal.getAllPerson()[i] == null) {
				break;
			}
			if (journal.getAllPerson()[i].getIdCard().getId().equals(this.getIdCard().getId()) &&
					journal.getAllPerson()[i].getFirstName().equals(this.getFirstName()) &&
					journal.getAllPerson()[i].getLastName().equals(this.getLastName())) {
				this.setStatusOfPerson(StatusOfPerson.IN_OFFICE);
				return;
			}
		}
	}

	public void forceEnterToOffice(Journal office) {
		this.setStatusOfPerson(StatusOfPerson.IN_OFFICE_WITHOUT_CARD);
	}

	@Override
	public String toString() {
		return "Employee{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", idCard=" + idCard +
				", statusOfPerson=" + statusOfPerson +
				'}';
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
