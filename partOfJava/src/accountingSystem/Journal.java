package accountingSystem;

import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.employee.Employee;
import accountingSystem.validators.EmployeeListValidator;
import accountingSystem.validators.ExistingInListException;
import accountingSystem.validators.LimitOfEmployeeValidator;
import accountingSystem.validators.OutOfListLimitExaption;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Journal {

	//todo: new java.util.ArrayList.ArrayList(int capacity) constructor  [Pavel.Chachotkin]
//	todo: Пришел к такому решению. я использую listSize в валидаторе canBeAddedToList
//todo:	не знаю как привильнее изменить, так-же валидатор мне какжется можно реализовать правильнее
// прошу помочь с этим

	static ArrayList<Employee> list;
	static private int listSize;

	public Journal(int size) {
		list = new ArrayList<>(size);
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
			EmployeeListValidator.isEmployeeExistsInList(employee, list);
			LimitOfEmployeeValidator.canBeAddedToList(employee, list);
			employee.setIdCard(new IdCard());
			list.add(employee);
		} catch (ExistingInListException | OutOfListLimitExaption e) {
			e.printStackTrace();
		}
	}

	public void registerEmployees(Employee[] employees) {
		try {
			LimitOfEmployeeValidator.canArrayBeAddedToList(employees);
		} catch (OutOfListLimitExaption e) {
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
