package accountingSystem.validators;

import accountingSystem.Journal;
import accountingSystem.person.employee.Employee;

import java.util.List;

public class LimitOfEmployeeValidator {

	public static void canBeAddedToList(Employee employee, List<Employee> list) throws OutOfListLimitExaption {
		if (list.size() > Journal.getListSize() - 1) {

			throw new OutOfListLimitExaption("Out of limit of Persons in the registration list. Limit of persosn is: "
					+ Journal.getListSize() + ". Quantity of persons in the list: " + Journal.getAllEmployee().size());
		}
	}


	public static void canArrayBeAddedToList(Employee[] employees) throws OutOfListLimitExaption {

		for (Employee employee : employees) {
			if (Journal.getAllEmployee().size() > Journal.getListSize() - 1) {
				throw new OutOfListLimitExaption("Out of limit of Persons in the registration list. Limit of persosn is: "
						+ Journal.getListSize() + ". Quantity of persons in the list: " + Journal.getAllEmployee().size());
			}
			Journal.getAllEmployee().add(employee);
		}
		System.out.println("All Employees are added.\n" +
				"limit of persons in the list: " + Journal.getListSize() + "\n" +
				"Quantity of persons in the list:  " + Journal.getAllEmployee().size());
	}

}


