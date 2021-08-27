package accountingSystem;

import accountingSystem.person.employee.Employee;

public class Journal {

	private static int index = 0;
	Employee[] personArr = new Employee[15];

//	ArrayList<Employee> list = new ArrayList<>();


	public void registerEmployee(Employee employee) {
		if (index > personArr.length - 1) {
			System.out.println("Out of limit of Persons"); // exaption
			return; // зачем ?
		} else {
			personArr[index++] = employee;
		}
	}

	public Employee[] getPersonArr(){
		return personArr;
	}

	public Employee getEmployee(int index) {
		return personArr[index];
	}

}
