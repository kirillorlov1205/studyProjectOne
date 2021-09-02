package accountingSystem;

import accountingSystem.person.RoomForEmployee;
import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.employee.DevOps;
import accountingSystem.person.employee.manager.Director;

public class Main { //Tests

	public static void main(String[] args) {

//		DevOps and manager
		DevOps Tom = new DevOps("Tom", "Blanko", StatusOfPerson.OUT_OF_OFFICE);
		DevOps Donny = new DevOps("Donny", "Torro", StatusOfPerson.OUT_OF_OFFICE);
		DevOps Donny1 = new DevOps("Donny1", "Torro1", StatusOfPerson.OUT_OF_OFFICE);

		Director director = new Director("Tro","ba",StatusOfPerson.OUT_OF_OFFICE);

//		TestIdCard
		System.out.println(Tom.getIdCard().getId());
		System.out.println(Donny.getIdCard().getId());
		System.out.println(Donny1.getIdCard().getId());


//		StatusOfPerson
//		System.out.println(Tom.getStatusOfPerson());
//		Tom.goToOffice();
//		System.out.println(Tom.getStatusOfPerson());
//
//		System.out.println(Donny.getStatusOfPerson());
//		Donny.goToOfficeWithoutCard();
//		System.out.println(Donny.getStatusOfPerson());

//		register to Journal
		Journal office = new Journal();
		office.registerEmployee(Tom);
		office.registerEmployee(Donny);
		office.registerEmployee(Donny1);

//		enterToOffice
		System.out.println(Tom.getStatusOfPerson());
		Tom.enterToOffice(office);
		System.out.println(Tom.getStatusOfPerson());
		Tom.forceEnterToOffice(office);
//		System.out.println(Tom.getStatusOfPerson());

		Donny.enterToOffice(office);
		System.out.println(Donny.getStatusOfPerson());

//		VIP
		Director directorKirill = new Director("Kirill", "Orlov", StatusOfPerson.OUT_OF_OFFICE);
		director.turnOnTheHandleOf123Room();

		//	list integration
//		office.list.registerEmployee1(new Employee("Kirill","Orlov",StatusOfPerson.OUT_OF_OFFICE));
//		office.list.add(Tom);
//		office.registerEmployee1(Tom);
//		office.registerEmployee1(Tom);

//		getQuantityByStatus
		System.out.println("quantity of persons in office: " + office.getQuantityOfInOffice());
		System.out.println("quantity of persons out of office: " + office.getQuantityOfOutOfOffice());
		System.out.println("quantity of persons in office with card: " + office.getQuantityOfInOfficeWithoutCard());

//		RoomForEmployee
		RoomForEmployee<DevOps> roomForEmployee = new RoomForEmployee<>(new DevOps[]{Tom});
		System.out.println(roomForEmployee.toString());




	}
}
