package accountingSystem;

import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.employee.Employee;

public class Journal {

	private static int index = 0;
	Employee[] personArr = new Employee[15];

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

	public void registerEmployee(Employee employee) {
		// TODO: 9/1/2021 This condition must check Validator class [Pavel.Chachotkin]
		if (index > personArr.length - 1) {
			System.out.println("Out of limit of Persons"); // exaption
		} else {
			personArr[index++] = employee;
		}
	}

//	MULTIPLE REGISTER
//	public void registerMultipleEmployee(Employee employee){
//		do {
//			registerEmployee(employee);
//		}while(employee == null);
//	}

//  	try multiple register

//	public void registerEmployee(Employee employee) {
//		while (employee == null){
//			if (index > personArr.length - 1) {
//				System.out.println("Out of limit of Persons"); // exaption
//				return; // зачем ?
//			} else {
//				personArr[index++] = employee;
//			}
//			registerEmployee(employee);
//		}
//		}


	public int getQuantityOfInOffice() {
		int quantityOfInOffice = 0;
		for (int i = 0; i < this.getAllPerson().length - 1; i++) {
			if (this.getAllPerson()[i] == null) {
				break;
			}
			if (this.getAllPerson()[i].getStatusOfPerson() == StatusOfPerson.IN_OFFICE) {
				quantityOfInOffice++;
			}
		}
		return quantityOfInOffice;
	}

	public int getQuantityOfOutOfOffice() {
		int quantityOfOutOfOffice = 0;
		for (int i = 0; i < this.getAllPerson().length - 1; i++) {
			if (this.getAllPerson()[i] == null) {
				break;
			}
			if (this.getAllPerson()[i].getStatusOfPerson() == StatusOfPerson.OUT_OF_OFFICE) {
				quantityOfOutOfOffice++;
			}
		}
		return quantityOfOutOfOffice;
	}

	public int getQuantityOfInOfficeWithoutCard() {
		int quantityOfInOfficeWithoutCard = 0;
		for (int i = 0; i < this.getAllPerson().length - 1; i++) {
			if (this.getAllPerson()[i] == null) {
				break;
			}
			if (this.getAllPerson()[i].getStatusOfPerson() == StatusOfPerson.IN_OFFICE_WITHOUT_CARD) {
				quantityOfInOfficeWithoutCard++;
			}
		}
		return quantityOfInOfficeWithoutCard;
	}

	public Employee[] getAllPerson() {
		return personArr;
	}


	public Employee getEmployee(int index) {
		return personArr[index];
	}

}
