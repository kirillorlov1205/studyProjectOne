package accountingSystem.person;

import accountingSystem.person.employee.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RoomForEmployee<T extends Employee> {

	ArrayList<T> listOfEmployeeInTheRoom = new ArrayList<>();

	public RoomForEmployee() { // TODO: 9/26/2021 Is this constructor required? [Pavel.Chachotkin]
	}

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
