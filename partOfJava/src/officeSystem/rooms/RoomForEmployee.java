package officeSystem.rooms;

import officeSystem.employee.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RoomForEmployee<T extends Employee> {

	ArrayList<T> listOfEmployeeInTheRoom = new ArrayList<>();

	public void addEmployeeToTheRoomForEmployee(T t) {
		listOfEmployeeInTheRoom.add(t);
	}

	public void addEmployeesToTheRoomForEmployee(T[] t) {
		listOfEmployeeInTheRoom.addAll(Arrays.asList(t));
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
