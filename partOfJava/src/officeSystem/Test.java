package officeSystem;

import officeSystem.employee.DevOps;
import officeSystem.employee.Employee;
import officeSystem.employee.manager.Director;
import officeSystem.system.Office;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class Test {

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
		Office office = new Office(2);
		office.registerEmployee(Tom);
		office.registerEmployee(Donny);
//		office.registerEmployee(Tom);
//		office.registerEmployee(Donny1);


//		open/close Journal------------------------------
//		office.closeJournal();
//		Journal office1 = office.openJournal(office);
//		office.registerEmployee(new DevOps());
//		System.out.println(Arrays.toString(office1.getAllEmployees().toArray()));


//		registerMultipleUsers------------------------------
//		Employee[] employees = new Employee[]{Donny, Donny};
//		ArrayList<Employee> list = new ArrayList<>();
//		list.addAll(Arrays.asList(employees));
//		list.add(new DevOps());
//		System.out.println("----");
//
//		office.registerListOfEmployees(list);
//		System.out.println();
//		System.out.println(Arrays.toString(office.getAllEmployees().toArray()));


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
		office.enterToOffice(Tom);
		System.out.println("quantity of persons in office: " + office.getQuantityOfEmployeeInOffice());
		System.out.println("quantity of persons out of office: " + office.getQuantityOfEmployeeOutOfOffice());
		System.out.println("quantity of persons in office with card: " + office.getQuantityOfEmployeeInOfficeWithoutCard());


//		RoomForEmployee------------------------------
//		RoomForEmployee<Employee> roomForEmployee = new RoomForEmployee<>();
//		roomForEmployee.addEmployeeToTheRoomForEmployee(Tom);
//		DevOps [] employeesArr = new DevOps[]{Donny,Donny1};
//
//		roomForEmployee.addEmployeesToTheRoomForEmployee(employeesArr);
//
//		System.out.println(roomForEmployee.getListOfEmployeeInTheRoom());


//getQuantityOfEmployeeInOffice - Переписать эти методы через стримы
//accountingSystem.Journal#getQuantityOfEmployeeOutOfOffice - Переписать эти методы через стримы
//accountingSystem.Journal#getQuantityOfEmployeeInOfficeWithoutCard  - Переписать эти методы через стримы
	}
}
