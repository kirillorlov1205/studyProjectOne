package accountingSystem.person;

import accountingSystem.person.employee.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RoomForEmployee<T extends Employee> {

	ArrayList<T> listOfEmployeeInTheRoom = new ArrayList<>();

	public RoomForEmployee(T e) {
		listOfEmployeeInTheRoom.add(e);
	}

	public RoomForEmployee(T[] arrOfEmployees){
		listOfEmployeeInTheRoom.addAll(Arrays.asList(arrOfEmployees));
	}

	public void addEmployeeToTheRoomForEmployee(T t) {
		listOfEmployeeInTheRoom.add(t);
	}

	public ArrayList<T> getListOfEmployeeInTheRoom() {
		return listOfEmployeeInTheRoom;
	}

	@Override
	public String toString() {
		return "RoomForEmployee{" +
				"listOfEmployeeInTheRoom=" + listOfEmployeeInTheRoom +
				'}';
	}
}
