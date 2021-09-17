package accountingSystem;

import accountingSystem.person.employee.Employee;

import java.util.List;

public class LimitOfEmployeeValidator {

	// TODO: 9/14/2021 Read about the naming classes and methods [Pavel.Chachotkin]
//todo:	здесь исправь добавь list в параметры name: canBeAddedToList
	public static void validateEmployeeRegistration(Employee employee) throws Exception {
		if (Journal.getAllEmployee().size() > Journal.getListSize() - 1) {
			throw new Exception("Out of limit of Persons in the registration list. Limit of persosn is: "
					+ Journal.getListSize() + ". Quantity of persons in the list: " + Journal.getAllEmployee().size());
		}
	}


	public static void validateEmployeesRegistration(Employee[] employees) throws Exception {
		int index = 0;

		for (Employee employee : employees) {
			if (Journal.getAllEmployee().size() > Journal.getListSize() - 1) {
				throw new Exception("Out of limit of Persons in the registration list. Limit of persosn is: "
						+ Journal.getListSize() + ". Quantity of persons in the list: " + Journal.getAllEmployee().size());
			}
			Journal.getAllEmployee().add(employee);
			index++;
		}
		System.out.println("All Employees are added.\n" +
				"limit of persons in the list: " + Journal.getListSize() + "\n" +
				"Quantity of persons in the list:  " + Journal.getAllEmployee().size());
	}

}


