package accountingSystem;

import accountingSystem.person.employee.Employee;

public class LimitOfEmployeeValidator {

	// TODO: 9/14/2021 This method must only validate employee and can not add employee to Journal [Pavel.Chachotkin]
	// TODO: 9/14/2021 Read about the naming classes and methods [Pavel.Chachotkin]
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
			// TODO: 9/14/2021 Check this condition [Pavel.Chachotkin]
			if (index > employees.length - 1) {
				System.out.println("All Employees are added.\n" +
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


