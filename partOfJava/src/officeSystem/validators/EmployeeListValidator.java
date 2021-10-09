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

	public static void listOfEmployeesForRegistration(ArrayList<Employee> employeesForRegistration, ArrayList<Employee> listOfOffice, int listSize) throws OutOfListLimitException {

		// TODO: 10/6/2021 переделать.
		for (Employee employee : employeesForRegistration) {
			if (listOfOffice.size() > listSize - 1) {
				throw new OutOfListLimitException("Out of limit of Persons in the registration list. Limit of persons is: "
						+ listSize + ". Quantity of persons in the list: " + listOfOffice.size());
			}
			// TODO: 10/6/2021 не должен добавлять
			listOfOffice.add(employee);
		}
		System.out.println("All Employees are added.\n" +
				"limit of persons in the list: " + listSize + "\n" +
				"Quantity of persons in the list:  " + listOfOffice.size());
	}

}


