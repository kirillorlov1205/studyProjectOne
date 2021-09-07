package accountingSystem;

import accountingSystem.person.employee.Employee;

public class LimitOfEmployeeValidator {

	public static void validateEmployeeRegistration(Employee employee) throws Exception {
		if (Journal.getAllEmployee().size() > Journal.getListSize() - 1) {
			throw new Exception("Out of limit of Persons in the registration list. Limit of persosn is: "
					+ Journal.getListSize() + ". Quantity of persons in the list: " + Journal.getAllEmployee().size());
		} else {
			Journal.getAllEmployee().add(employee);
		}
	}


	public static void validateEmployeesRegistration(Employee[] employees) throws Exception {
		int index = 0;

		for (Employee employee : employees) {
			if (index > employees.length - 1) {
				throw new Exception("All Employees are added.\n" +
						"limit of persons in the list: " + Journal.getListSize() + "\n" +
						"Quantity of persons in the list:  " + Journal.getAllEmployee().size());
			}
			if (Journal.getAllEmployee().size() > Journal.getListSize() - 1) {
				throw new Exception("Out of limit of Persons in the registration list. Limit of persosn is: "
						+ Journal.getListSize() + ". Quantity of persons in the list: " + Journal.getAllEmployee().size());
			}
			Journal.getAllEmployee().add(employee);
			index++;
		}

	}

}


