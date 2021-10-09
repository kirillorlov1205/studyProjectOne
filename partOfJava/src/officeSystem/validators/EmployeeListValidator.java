package officeSystem.validators;

import officeSystem.employee.Employee;
import officeSystem.validators.exeptions.ExistingInListException;
import officeSystem.validators.exeptions.OutOfListLimitException;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListValidator {

	public static void isEmployeeExistsInList(Employee employee, List<Employee> list) throws ExistingInListException {

		if (list.contains(employee)) {
			throw new ExistingInListException("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " already exist in the current list");
		}
	}

	public static void isLimitOfEmployeesReached(Employee employee, ArrayList<Employee> list, int listSize) throws OutOfListLimitException {
		if (list.size() >= listSize) {
			throw new OutOfListLimitException("Out of limit of Persons in the registration list. Limit of persons is: "
					+ listSize + ". Quantity of persons in the list: " + list.size());
		}
	}

}


