package accountingSystem;

import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Journal {

	static private int listSize;
	// TODO: 9/14/2021 Read about new java.util.ArrayList.ArrayList(int capacity) constructor  [Pavel.Chachotkin]
	static ArrayList<Employee> list = new ArrayList<>(listSize);

	public Journal(int size) {
		listSize = size;
	}

	public static class IdCard {
		private String id;

		public IdCard() {
			Random random = new Random();
			id = Double.toString(random.nextDouble()).substring(0, 10);
		}

		public String getId() {
			return id;
		}

		@Override
		public String toString() {
			return "IdCard{" +
					"id='" + id + '\'' +
					'}';
		}

	}

	public void registerEmployee(Employee employee) {
		try {
			//todo: equals переписать в валидатор
			EmployeeListValidator.isEmployeeExistsInList(employee, list);

			LimitOfEmployeeValidator.validateEmployeeRegistration(employee);

			employee.setIdCard(new IdCard());

			list.add(employee);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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

	public int getQuantityOfEmployeeInOffice() {
		int quantityOfEmployeeInOffice = 0;
		for (Employee employee : list) {
			if (employee == null) {
				break;
			}
			if (employee.getStatusOfPerson() == StatusOfPerson.IN_OFFICE) {
				quantityOfEmployeeInOffice++;
			}
		}
		return quantityOfEmployeeInOffice;
	}

	public int getQuantityOfEmployeeOutOfOffice() {
		int quantityOfEmployeeOutOfOffice = 0;
		for (Employee employee : list) {
			if (employee == null) {
				break;
			}
			if (employee.getStatusOfPerson() == StatusOfPerson.OUT_OF_OFFICE) {
				quantityOfEmployeeOutOfOffice++;
			}
		}
		return quantityOfEmployeeOutOfOffice;
	}

	public int getQuantityOfEmployeeInOfficeWithoutCard() {
		int quantityOfEmployeeInOfficeWithoutCard = 0;
		for (Employee employee : list) {
			if (employee == null) {
				break;
			}
			if (employee.getStatusOfPerson() == StatusOfPerson.IN_OFFICE_WITHOUT_CARD) {
				quantityOfEmployeeInOfficeWithoutCard++;
			}
		}
		return quantityOfEmployeeInOfficeWithoutCard;
	}


	public static List<Employee> getAllEmployee() {
		return list;
	}

	public Employee getEmployee(int index) {
		return list.get(index);
	}

	public static int getListSize() {
		return listSize;
	}

	@Override
	public String toString() {
		return "Journal{" +
				"list=" + list +
				'}';
	}
}
