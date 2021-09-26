package accountingSystem.validators;

import accountingSystem.Journal;
import accountingSystem.person.employee.Employee;

import java.util.ArrayList;

public class LimitOfEmployeeValidator {

	public static int listSize = Journal.getListSize();

	public static void canBeAddedToList(Employee employee, ArrayList<Employee> list) throws OutOfListLimitExaption {
		if (list.size() > listSize - 1) {

			throw new OutOfListLimitExaption("Out of limit of Persons in the registration list. Limit of persons is: "
					+ listSize + ". Quantity of persons in the list: " + list.size());
		}
	}


	public static void canEmployeeListBeAddedToList(ArrayList<Employee> employeeArrayList, ArrayList<Employee> journalList) throws OutOfListLimitExaption {

		for (Employee employee : employeeArrayList) {
			if (journalList.size() > listSize - 1) {
				throw new OutOfListLimitExaption("Out of limit of Persons in the registration list. Limit of persons is: "
						+ listSize + ". Quantity of persons in the list: " + journalList.size());
			}
			journalList.add(employee);
		}
		System.out.println("All Employees are added.\n" +
				"limit of persons in the list: " + listSize + "\n" +
				"Quantity of persons in the list:  " + journalList.size());
	}

}


