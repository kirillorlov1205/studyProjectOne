package accountingSystem;

import accountingSystem.person.employee.Employee;

public class LimitOfEmployeeValidator {

	// TODO: 9/7/2021 What should do this class? [Pavel.Chachotkin]
	public static void validateEmployeeRegistration(Employee employee) throws Exception {
		if (Journal.index > Journal.personArr.length - 1) {
			throw new Exception("Out of limit of Persons in the registration list. limit of persons is: " + Journal.personArr.length + ". Quantity of persons in the list: " + (Journal.index + 1));
		} else {
			Journal.personArr[Journal.index++] = employee;
		}
	}

	// TODO: 9/7/2021 What should do this class? [Pavel.Chachotkin]
	public static void validateEmployeesRegistration(Employee[] employees) throws Exception {
		for (int i = 0; i <= Journal.personArr.length - 1; i++) {
			if(i > employees.length - 1){
				System.out.println("All Employees are added");
				break;
			}
			if (Journal.index > Journal.personArr.length - 1) {
				throw new Exception("Out of limit of Persons in the registration list. limit of persons is: " + Journal.personArr.length + ". Quantity of persons in the list: " + (Journal.index + 1));
			} else {
				Journal.personArr[Journal.index++] = employees[i];
			}
		}
		//		for (int i = 0; i <= personArr.length - 1; i++) {
//			if(i > employees.length - 1){
//				System.out.println("All Employees are added");
//				break;
//			}
//
//			if (index >= personArr.length - 1) {
//				System.out.println("Out of limit of Persons"); // exaption
//			} else {
//				personArr[index++] = employees[i];
//			}
//		}
	}
}


