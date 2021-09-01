package accountingSystem.person;

import java.util.Arrays;

public class RoomForEmployee<Employee> {

	Employee[] employeeInTheRoomArr;

	public RoomForEmployee(Employee[] employeeInTheRoomArr) {
			this.employeeInTheRoomArr = employeeInTheRoomArr;
	}

	@Override
	public String toString() {
		return "RoomForEmployee{" +
				"employeeInTheRoomArr=" + Arrays.toString(employeeInTheRoomArr) +
				'}';
	}
}
