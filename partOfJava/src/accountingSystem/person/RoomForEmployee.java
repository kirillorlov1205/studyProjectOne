package accountingSystem.person;

import java.util.ArrayList;
import java.util.Arrays;

// TODO: 9/1/2021 This generic class has not restrictions [Pavel.Chachotkin]
public class RoomForEmployee<T> {

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
