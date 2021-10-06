package accountingSystem.validators;

import accountingSystem.Journal;
import accountingSystem.person.employee.Employee;

import java.util.ArrayList;

public class LimitOfEmployeeValidator {

	// TODO: 10/2/2021 What I have to do when I need to create my own Journal class? [Pavel.Chachotkin]
	public int listSize = Journal.getListSize();

	// TODO: 10/6/2021 isLimitOfEmployeelistReached
	public void canBeAddedToList(Employee employee, ArrayList<Employee> list) throws OutOfListLimitException {
		if (list.size() >= this.listSize) {

			throw new OutOfListLimitException("Out of limit of Persons in the registration list. Limit of persons is: "
					+ listSize + ". Quantity of persons in the list: " + list.size());
		}
	}

	// TODO: 10/6/2021 listOfEmForResgistration
	public static void canEmployeeListBeAddedToList(ArrayList<Employee> employeeArrayList, ArrayList<Employee> journalList) throws OutOfListLimitException {

		// TODO: 10/6/2021 переделать.
		for (Employee employee : employeeArrayList) {
			if (journalList.size() > listSize - 1) {
				throw new OutOfListLimitException("Out of limit of Persons in the registration list. Limit of persons is: "
						+ listSize + ". Quantity of persons in the list: " + journalList.size());
			}
			// TODO: 10/6/2021 не должен добавлять
			journalList.add(employee);
		}
		System.out.println("All Employees are added.\n" +
				"limit of persons in the list: " + listSize + "\n" +
				"Quantity of persons in the list:  " + journalList.size());
	}

}


