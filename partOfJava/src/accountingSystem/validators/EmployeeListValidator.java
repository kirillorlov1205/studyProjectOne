package accountingSystem.validators;

import accountingSystem.person.employee.Employee;

import java.util.List;

public class EmployeeListValidator {

	public static void isEmployeeExistsInList(Employee employee, List<Employee> list) throws ExistingInListException {
		for (Employee employee1 : list) {
			if (employee1 == null) {
				break; // TODO: 9/26/2021 Only break? [Pavel.Chachotkin]
			}
			if (list.contains(employee)) {
				throw new ExistingInListException("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " already exist in the current list");
			}
		}
	}

}
