package accountingSystem;

import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.employee.Employee;

import java.util.Arrays;

public class Journal {

	static int index = 0;
	static Employee[] personArr = new Employee[3];

//ARRLIST
//	list integration
//	ArrayList<Employee> list = new ArrayList<>();
//
//	public void registerEmployee1(Employee employee){
//		if(list.size() >= 10){
//			System.out.println("Out of limit of Persons"); // exaption
//		}else{
//			list.add(employee);
//		}
//	}
//

	public void registerEmployees(Employee employee) {
		// TODO: 9/1/2021 This condition must check Validator class [Pavel.Chachotkin]
		try {
			LimitOfEmployeeValidator.validateEmployeeRegistration(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// todo: не понимаю почему не падает ексепшн в этом методе при передаче работников больше числа personArr
	public void registerEmployees(Employee[] employees) {
		try {
			LimitOfEmployeeValidator.validateEmployeesRegistration(employees);
		} catch (Exception e) {
			e.printStackTrace();
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

	public void enterToOffice(Employee employee) {
		for (int i = 0; i < personArr.length - 1; i++) {
			if (this.getAllEmployee()[i] == null) {
				break;
			}
			if (this.getAllEmployee()[i].getIdCard().getId().equals(employee.getIdCard().getId()) &&
					this.getAllEmployee()[i].getFirstName().equals(employee.getFirstName()) &&
					this.getAllEmployee()[i].getLastName().equals(employee.getLastName())) {
				employee.setStatusOfPerson(StatusOfPerson.IN_OFFICE);
				return;
			}
		}
	}

	public void forceEnterToOffice(Employee employee) {
		employee.setStatusOfPerson(StatusOfPerson.IN_OFFICE_WITHOUT_CARD);
	}


	public int getQuantityOfInOffice() {
		int quantityOfInOffice = 0;
		for (int i = 0; i < this.getAllEmployee().length - 1; i++) {
			if (this.getAllEmployee()[i] == null) {
				break;
			}
			if (this.getAllEmployee()[i].getStatusOfPerson() == StatusOfPerson.IN_OFFICE) {
				quantityOfInOffice++;
			}
		}
		return quantityOfInOffice;
	}

	public int getQuantityOfOutOfOffice() {
		int quantityOfOutOfOffice = 0;
		for (int i = 0; i < this.getAllEmployee().length - 1; i++) {
			if (this.getAllEmployee()[i] == null) {
				break;
			}
			if (this.getAllEmployee()[i].getStatusOfPerson() == StatusOfPerson.OUT_OF_OFFICE) {
				quantityOfOutOfOffice++;
			}
		}
		return quantityOfOutOfOffice;
	}

	public int getQuantityOfInOfficeWithoutCard() {
		int quantityOfInOfficeWithoutCard = 0;
		for (int i = 0; i < this.getAllEmployee().length - 1; i++) {
			if (this.getAllEmployee()[i] == null) {
				break;
			}
			if (this.getAllEmployee()[i].getStatusOfPerson() == StatusOfPerson.IN_OFFICE_WITHOUT_CARD) {
				quantityOfInOfficeWithoutCard++;
			}
		}
		return quantityOfInOfficeWithoutCard;
	}

	public  Employee[] getAllEmployee() {
		return personArr;
	}

	@Override
	public String toString() {
		return "Journal{" +
				"personArr=" + Arrays.toString(personArr) +
				'}';
	}

	public Employee getEmployee(int index) {
		return personArr[index];
	}

	public static int getIndex(){
		return index;
	}

}
