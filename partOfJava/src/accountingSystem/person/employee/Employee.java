package accountingSystem.person.employee;

import accountingSystem.Journal;
import accountingSystem.person.Person;
import accountingSystem.person.StatusOfPerson;

import java.util.Random;

public abstract class Employee extends Person {

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

	public void goToOffice(Journal journal){
		for (int i = 0; i < journal.getPersonArr().length - 1; i++) {
			if (journal.getPersonArr()[i] == null) {
				break;
			}
			if (journal.getPersonArr()[i].getIdCard().getId() == this.getIdCard().getId() &&
					journal.getPersonArr()[i].getFirstName().equals(this.getFirstName()) &&
					journal.getPersonArr()[i].getLastName().equals(this.getLastName())
			) {
				this.setStatusOfPerson(StatusOfPerson.IN_OFFICE);
				return;
			}
		}
	}

	public void forceEnterToOffice(Journal office){
		this.setStatusOfPerson(StatusOfPerson.IN_OFFICE_WITHOUT_CARD);
	}


	public class IdCard {
		private String id;

		public IdCard() {
			Random random = new Random();
			id = Double.toString(random.nextDouble()).substring(0,10);
		}

		public String getId() {
			return id;
		}

		//	test
		public void setIdCard(String id){
			this.id = id;
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
