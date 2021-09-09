package accountingSystem.person;

import java.util.Arrays;

// TODO: 9/1/2021 This generic class has not restrictions [Pavel.Chachotkin]
public class RoomForEmployee<T> {

	T[] employeeInTheRoomArr;

	public RoomForEmployee(T[] employeeInTheRoomArr) {
			this.employeeInTheRoomArr = employeeInTheRoomArr;
	}

	@Override
	public String toString() {
		return "RoomForEmployee{" +
				"employeeInTheRoomArr=" + Arrays.toString(employeeInTheRoomArr) +
				'}';
	}
}
