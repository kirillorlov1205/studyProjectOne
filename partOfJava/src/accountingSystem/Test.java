package accountingSystem;

import accountingSystem.person.employee.DevOps;
import accountingSystem.person.employee.manager.Director;

import java.util.Arrays;

public class Test { //Tests

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


//		register to Journal------------------------------
		Journal office = new Journal(3);
		office.registerEmployee(Tom);
//		office.registerEmployee(Tom);
//		office.registerEmployee(Donny);
//		office.registerEmployee(Donny1);
//		Journal.closeJournal(office);

		Journal office1 = null;
		office1 = Journal.openJournal(office);

//		office.registerEmployee(new DevOps());
		System.out.println(Arrays.toString(Journal.getAllEmployee().toArray()));

//		registerMultipleUsers------------------------------
//		Employee[] employees = new Employee[]{Tom, Donny, Donny1};
//		ArrayList<Employee> list = new ArrayList<>();
//		list.addAll(Arrays.asList(employees));
//		list.add(new DevOps());
//		System.out.println("----");
//
//		office.registerEmployeeList(list);
//		System.out.println();
//		System.out.println(Arrays.toString(Journal.getAllEmployee().toArray()));


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


//		getQuantityByStatus------------------------------
//		System.out.println("quantity of persons in office: " + office.getQuantityOfInOffice());
//		System.out.println("quantity of persons out of office: " + office.getQuantityOfOutOfOffice());
//		System.out.println("quantity of persons in office with card: " + office.getQuantityOfInOfficeWithoutCard());


//		RoomForEmployee------------------------------
//		RoomForEmployee<Employee> roomForEmployee = new RoomForEmployee<>();
//		roomForEmployee.addEmployeeToTheRoomForEmployee(Tom);
//		DevOps [] employeesArr = new DevOps[]{Donny,Donny1};
//
//		roomForEmployee.addEmployeesToTheRoomForEmployee(employeesArr);
//
//		System.out.println(roomForEmployee.getListOfEmployeeInTheRoom());


	}
}
