package accountingSystem;

import accountingSystem.person.RoomForEmployee;
import accountingSystem.person.employee.DevOps;
import accountingSystem.person.employee.Employee;
import accountingSystem.person.employee.manager.Director;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

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


//		register to Journal------------------------------
		Journal office = new Journal(4);
//		office.registerEmployee(Tom);
//		office.registerEmployee(Donny);
//		office.registerEmployee(Donny1);
//		office.registerEmployee(new DevOps());
//		System.out.println(Arrays.toString(Journal.getAllEmployee().toArray()));


//		registerMultipleUsers------------------------------
//		Employee[] employees = new Employee[]{Tom, Donny, Donny1,director};
//		System.out.println("----");
//
//		// todo: не понимаю почему не падает ексепшн в этом методе при передаче работников меньше чем число оставшихся ячеек в листе
//		office.registerEmployees(employees);
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
		RoomForEmployee<DevOps> roomForEmployee = new RoomForEmployee<>(new DevOps[]{Tom,Donny,Donny1});
		System.out.println(roomForEmployee.getListOfEmployeeInTheRoom());

//		RoomForEmployee<DevOps> roomForEmployee = new RoomForEmployee<>(Tom);
//
//		roomForEmployee.addEmployeeToTheRoomForEmployee(Donny);
//
//		System.out.println(roomForEmployee.getListOfEmployeeInTheRoom().toString());


	}
}
