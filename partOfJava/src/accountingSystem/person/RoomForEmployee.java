package accountingSystem.person;

import java.util.Arrays;

// TODO: 9/1/2021 We should mark type for generic as char (T for example) [Pavel.Chachotkin]

// TODO: 9/1/2021 This generic class has not restrictions [Pavel.Chachotkin]
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
