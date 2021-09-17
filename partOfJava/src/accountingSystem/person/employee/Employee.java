package accountingSystem.person.employee;

import accountingSystem.Journal;
import accountingSystem.person.Person;
import accountingSystem.person.StatusOfPerson;

import java.util.Random;

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
		// TODO: 9/14/2021 According requirements IdCard must be set in Journal [Pavel.Chachotkin]
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

	public void setIdCard(Journal.IdCard idCard){
		this.idCard = idCard;
	}

	// TODO: 9/14/2021  Why template for IdCard placed here? [Pavel.Chachotkin] -- где должно быть ?
//	public class IdCard {
//		private String id;
//
//		public IdCard() {
//			Random random = new Random();
//			id = Double.toString(random.nextDouble()).substring(0, 10);
//		}
//
//		public String getId() {
//			return id;
//		}
//
//		@Override
//		public String toString() {
//			return "IdCard{" +
//					"id='" + id + '\'' +
//					'}';
//		}
//
//	}

}
