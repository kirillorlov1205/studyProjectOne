package AccountingSystem;

import AccountingSystem.Persons.Employee.DevOps;
import AccountingSystem.Persons.Employee.Employee;
import AccountingSystem.Persons.Managers.Director;
import AccountingSystem.Persons.StatusOfPerson;

public class Main { //Tests

	public static void main(String[] args) {

//		DevOps
		DevOps Tom = new DevOps("Tom", "Blanko", StatusOfPerson.OUT_OF_OFFICE);
		DevOps Donny = new DevOps("Donny", "Torro", StatusOfPerson.OUT_OF_OFFICE);
		DevOps Donny1 = new DevOps("Donny1", "Torro1", StatusOfPerson.OUT_OF_OFFICE);

//		TestIdCard
//		System.out.println(Tom.getIdCard().getId());
//		System.out.println(Donny.getIdCard().getId());
//		System.out.println(Donny1.getIdCard().getId());



//		StatusOfPerson
//		System.out.println(Tom.getStatusOfPerson());
//		Tom.goToOffice();
//		System.out.println(Tom.getStatusOfPerson());
//
//
//		System.out.println(Donny.getStatusOfPerson());
//		Donny.goToOfficeWithoutCard();
//		System.out.println(Donny.getStatusOfPerson());

//		add to Journal
		Journal journal = new Journal();
		journal.addToPersonArr(Tom);
		journal.addToPersonArr(Donny);
		journal.addToPersonArr(Donny1);

//		checkpoint
		journal.checkpoint(Tom);
		System.out.println(Tom.getStatusOfPerson());
		journal.checkpoint(Donny1);
		System.out.println(Donny1.getStatusOfPerson());

//		VIP
		Director director = new Director("Kirill", "Orlov", StatusOfPerson.OUT_OF_OFFICE);
		director.turnOnTheHandleOf123Room();

		//	list integration
//		journal.list.add(new Employee("Kirill","Orlov",StatusOfPerson.OUT_OF_OFFICE));
	}
	

}
