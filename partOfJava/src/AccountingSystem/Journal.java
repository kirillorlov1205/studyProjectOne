package AccountingSystem;

import AccountingSystem.Persons.Employee.Employee;
import AccountingSystem.Persons.StatusOfPerson;

public class Journal {

	private static int index = 0;
	Employee[] personsArr = new Employee[15];

//	ArrayList<Employee> list = new ArrayList<>();


	public void addToPersonArr(Employee employee) {
		if (index > personsArr.length - 1) {
			System.out.println("Out of limit of Persons");
			return;
		} else {
			personsArr[index++] = employee;
		}
	}

	public void checkpoint(Employee employee) {
		for (int i = 0; i < personsArr.length - 1; i++) {
			if (personsArr[i] == null) {
				break;
			}
			if (personsArr[i].getIdCard().getId() == employee.getIdCard().getId() &&
					personsArr[i].getFirstName().equals(employee.getFirstName()) &&
					personsArr[i].getLastName().equals(employee.getLastName())
			) {
				employee.setStatusOfPerson(StatusOfPerson.IN_OFFICE);
				return;
			}
		}
		employee.setStatusOfPerson(StatusOfPerson.IN_OFFICE_WITHOUT_CARD);
	}

	public Employee getEmployee(int index) {
		return personsArr[index];
	}

}
