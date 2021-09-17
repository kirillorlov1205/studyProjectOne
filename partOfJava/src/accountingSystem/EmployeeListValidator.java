package accountingSystem;

import accountingSystem.person.employee.Employee;

import java.util.List;

public class EmployeeListValidator {

	public static void isEmployeeExistsInList(Employee employee, List<Employee> list) throws Exception {
		for (Employee employee1 : list) {
			if (employee1 == null) {
				break;
			}
			if (
//todo:					перейти на контейнс
					employee1.getFirstName().equals(employee.getFirstName()) &&
							employee1.getLastName().equals(employee.getLastName())) {
				throw new Exception("Current employee already exist in the current list" + list.indexOf(employee1));
			}
		}
	}

}
