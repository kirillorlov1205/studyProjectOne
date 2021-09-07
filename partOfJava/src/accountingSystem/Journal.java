package accountingSystem;

import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Journal {

	static private int listSize;
	static ArrayList<Employee> list = new ArrayList<>(listSize);

	public Journal(int size) {
		listSize = size;
	}


	public void registerEmployee(Employee employee) {
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
	}

	public void enterToOffice(Employee employee) {
		for (Employee employee1 : list) {
			if (employee1 == null) {
				break;
			}
			if (employee1.getIdCard().getId().equals(employee.getIdCard().getId()) &&
					employee1.getFirstName().equals(employee.getFirstName()) &&
					employee1.getLastName().equals(employee.getLastName())) {
				employee1.setStatusOfPerson(StatusOfPerson.IN_OFFICE);
				return;
			}
		}
	}

	public void forceEnterToOffice(Employee employee) {
		employee.setStatusOfPerson(StatusOfPerson.IN_OFFICE_WITHOUT_CARD);
	}

	public int getQuantityOfInOffice() {
		int quantityOfInOffice = 0;
		for (Employee employee : list) {
			if (employee == null) {
				break;
			}
			if (employee.getStatusOfPerson() == StatusOfPerson.IN_OFFICE) {
				quantityOfInOffice++;
			}
		}
		return quantityOfInOffice;
	}

	public int getQuantityOfOutOfOffice() {
		int quantityOfOutOfOffice = 0;
		for (Employee employee : list) {
			if (employee == null) {
				break;
			}
			if (employee.getStatusOfPerson() == StatusOfPerson.OUT_OF_OFFICE) {
				quantityOfOutOfOffice++;
			}
		}
		return quantityOfOutOfOffice;
	}

	public int getQuantityOfInOfficeWithoutCard() {
		int quantityOfInOfficeWithoutCard = 0;
		for (Employee employee : list) {
			if (employee == null) {
				break;
			}
			if (employee.getStatusOfPerson() == StatusOfPerson.IN_OFFICE_WITHOUT_CARD) {
				quantityOfInOfficeWithoutCard++;
			}
		}
		return quantityOfInOfficeWithoutCard;
	}

	public static List<Employee> getAllEmployee() {
		return list;
	}


	public Employee getEmployee(int index) {
		return list.get(index);
	}

	public static int getListSize(){
		return listSize;
	}

	@Override
	public String toString() {
		return "Journal{" +
				"list=" + list +
				'}';
	}
}
