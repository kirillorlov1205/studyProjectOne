package officeSystem.system;

import officeSystem.employee.Employee;
import officeSystem.employee.StatusOfPerson;
import officeSystem.validators.EmployeeListValidator;
import officeSystem.validators.exeptions.ExistingInListException;
import officeSystem.validators.exeptions.OutOfListLimitException;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Office implements Serializable {

	ArrayList<Employee> list;
	private int maxListSize;

	public Office(int size) {
		this.list = new ArrayList<>(size);
		this.maxListSize = size;
	}

	public void closeJournal(Office this) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serializable.obraz"))) {
			oos.writeObject(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Office openJournal(Office journal) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Serializable.obraz"));
			journal = (Office) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return journal;
	}

	public void registerEmployee(Employee employee) {
		try {
			EmployeeListValidator.isEmployeeExistsInList(employee, list);

			EmployeeListValidator.isLimitOfEmployeesReached(employee, list, maxListSize);
			employee.setIdCard(new IdCard());
			list.add(employee);
		} catch (ExistingInListException | OutOfListLimitException e) {
			System.out.println("Limit of the employees in the list reached. " +
					"Try to remove one or make quantity of the new employee less." +
					" Limit of persons is: " + maxListSize + ". " + "Quantity of persons in the list: " + list.size() + ".");
			e.printStackTrace();
		}
	}

	public void registerListOfEmployees(ArrayList<Employee> employeeList) {
		try {
			for (Employee employee : employeeList) {
				EmployeeListValidator.isLimitOfEmployeesReached(employee, list, maxListSize);
				list.add(employee);
			}
		} catch (OutOfListLimitException e) {
			System.out.println("Limit of the employees in the list reached. " +
					"Try to remove one or make quantity of the new employee less." +
					" Limit of persons is: " + maxListSize + ". " + "Quantity of persons in the list: " + list.size() + ".");
			e.printStackTrace();
		}
	}

	public void enterToOffice(Employee employee) {
		for (Employee employee1 : list) {
			if (employee1.getIdCard().getId().equals(employee.getIdCard().getId()) &&
					employee.equals(employee1)) {
				employee1.setStatusOfPerson(StatusOfPerson.IN_OFFICE);
				return;
			}
		}
	}

	public void forceEnterToOffice(Employee employee) {
		employee.setStatusOfPerson(StatusOfPerson.IN_OFFICE_WITHOUT_CARD);
	}

	public void goFromOffice(Employee employee) {
		employee.setStatusOfPerson(StatusOfPerson.OUT_OF_OFFICE);
	}


	public ArrayList<Employee> getAllEmployees() {
		return list;
	}

	public int getMaxListSize() {
		return maxListSize;
	}

	public int getQuantityOfEmployeeInOffice() {
		int quantityOfEmployeeInOfficelist = ((int) list.stream()
				.filter(employee -> employee.getStatusOfPerson() == StatusOfPerson.IN_OFFICE)
				.count());
		return quantityOfEmployeeInOfficelist;
	}

	public int getQuantityOfEmployeeOutOfOffice() {
		int quantityOfEmployeeOutOfOffice = ((int) list.stream()
				.filter(employee -> employee.getStatusOfPerson() == StatusOfPerson.OUT_OF_OFFICE)
				.count());
		return quantityOfEmployeeOutOfOffice;
	}

	public int getQuantityOfEmployeeInOfficeWithoutCard() {
		int quantityOfEmployeeInOfficeWithoutCard = ((int) list.stream()
				.filter(employee -> employee.getStatusOfPerson() == StatusOfPerson.IN_OFFICE_WITHOUT_CARD)
				.count());
		return quantityOfEmployeeInOfficeWithoutCard;
	}


	@Override
	public String toString() {
		return "Journal{" +
				"list=" + list +
				'}';
	}

	public static class IdCard implements Serializable {
		private final String id;

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
}
