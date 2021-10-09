package officeSystem.employee;

import officeSystem.system.rooms.Vip;

public class DevOps extends Employee implements Vip {

	public DevOps() {
	}

	public DevOps(String fName, String lName) {
		super(fName, lName);
	}

	@Override
	public void turnOnTheHandleOf123Room() {
		System.out.println("Дверь комнты 123 открыта");
	}

}
