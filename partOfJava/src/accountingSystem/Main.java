package accountingSystem;

import accountingSystem.person.employee.DevOps;
import accountingSystem.person.employee.Employee;
import accountingSystem.person.employee.manager.Director;

import java.util.Arrays;

public class Main { //Tests

	public static void main(String[] args) {

//		DevOps and manager------------------------------
		DevOps Tom = new DevOps("Tom", "Blanko");
		DevOps Donny = new DevOps("Donny", "Torro");
		DevOps Donny1 = new DevOps("Donny1", "Torro1");

		Director director = new Director("Tro", "ba");


//		TestIdCard------------------------------
//		System.out.println(Tom.getIdCard().getId());
//		System.out.println(Donny.getIdCard().getId());
//		System.out.println(Donny1.getIdCard().getId());


//		StatusOfPerson------------------------------
//		System.out.println(Tom.getStatusOfPerson());
//		Tom.goToOffice();
//		System.out.println(Tom.getStatusOfPerson());
//
//		System.out.println(Donny.getStatusOfPerson());
//		Donny.goToOfficeWithoutCard();
//		System.out.println(Donny.getStatusOfPerson());


//		register to Journal------------------------------
		Journal office = new Journal();
//		office.registerEmployee(Tom);
//		office.registerEmployee(Donny);
//		office.registerEmployee(Donny1);
//
//		System.out.println(Arrays.toString(office.getAllEmployee()));


//		registerMultipleUsers------------------------------
		Employee[] employees = new Employee[]{Tom, Donny, Donny1, director, new DevOps()};
		System.out.println("----");

		// todo: не понимаю почему не падает ексепшн в этом методе при передаче работников больше числа personArr
		office.registerEmployees(employees);
		System.out.println(Arrays.toString(office.getAllEmployee()));


//		int index = 0;
//		for (int i = 0; i <= office.personArr.length; i++) {
//			System.out.print(index++ + " ");
//			office.registerEmployee(new DevOps());
//		}


//		enterToOffice------------------------------
//		System.out.println(Tom.getStatusOfPerson());
//		office.enterToOffice(Tom);
//		System.out.println(Tom.getStatusOfPerson());
//		office.forceEnterToOffice(Tom);
//		System.out.println(Tom.getStatusOfPerson());
//
//		office.enterToOffice(Donny);
//		System.out.println(Donny.getStatusOfPerson());


//		VIP------------------------------
//		Director directorKirill = new Director("Kirill", "Orlov");
//		director.turnOnTheHandleOf123Room();


//		list integration------------------------------
//		office.list.registerEmployee1(new Employee("Kirill","Orlov",StatusOfPerson.OUT_OF_OFFICE));
//		office.list.add(Tom);
//		office.registerEmployee1(Tom);
//		office.registerEmployee1(Tom);


//		getQuantityByStatus------------------------------
//		System.out.println("quantity of persons in office: " + office.getQuantityOfInOffice());
//		System.out.println("quantity of persons out of office: " + office.getQuantityOfOutOfOffice());
//		System.out.println("quantity of persons in office with card: " + office.getQuantityOfInOfficeWithoutCard());


//		RoomForEmployee------------------------------
//		RoomForEmployee<DevOps> roomForEmployee = new RoomForEmployee<>(new DevOps[]{Tom});
//		System.out.println(roomForEmployee.toString());


	}
}
