package officeSystem.employee.manager;

import officeSystem.system.rooms.Vip;

public class DeputyDirector extends Manager implements Vip {

	public DeputyDirector(String fName, String lName) {
		super(fName, lName);
	}

	@Override
	public void turnOnTheHandleOf123Room() {
		System.out.println("Дверь комнаты 123 открыта");
	}
}
