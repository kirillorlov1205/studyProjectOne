package officeSystem;

import officeSystem.employee.StatusOfPerson;
import officeSystem.employee.Employee;
import officeSystem.validators.exeptions.ExistingInListException;
import officeSystem.validators.EmployeeListValidator;
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
			//todo: закинуть в один валидатор
			EmployeeListValidator.isEmployeeExistsInList(employee, list);

			EmployeeListValidator.isLimitOfEmployeesReached(employee, list, maxListSize);
			employee.setIdCard(new IdCard());
			list.add(employee);
		} catch (ExistingInListException | OutOfListLimitException e) {
			// TODO: 10/2/2021 Add reworking for exception catching [Pavel.Chachotkin]
//			переделать вывод понятный для пользователя sout
			e.printStackTrace();
		}
	}

	public void registerEmployeeList(ArrayList<Employee> employeeList) {
		try {
			// TODO: 10/2/2021 Invalid solution [Pavel.Chachotkin]
			// TODO: 10/6/2021 добавлять снаружи и переименовать методы валидатора
			EmployeeListValidator.listOfEmployeesForRegistration(employeeList, list, maxListSize);
		} catch (OutOfListLimitException e) {
			// TODO: 10/2/2021 Add reworking for exception catching [Pavel.Chachotkin]
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
		int quantityOfEmployeeInOffice = 0;
		for (Employee employee : this.list) {
			if (employee.getStatusOfPerson() == StatusOfPerson.IN_OFFICE) {
				quantityOfEmployeeInOffice++;
			}
		}
		return quantityOfEmployeeInOffice;
	}

	public int getQuantityOfEmployeeOutOfOffice() {
		int quantityOfEmployeeOutOfOffice = 0;
		for (Employee employee : this.list) {
			if (employee.getStatusOfPerson() == StatusOfPerson.OUT_OF_OFFICE) {
				quantityOfEmployeeOutOfOffice++;
			}
		}
		return quantityOfEmployeeOutOfOffice;
	}

	public int getQuantityOfEmployeeInOfficeWithoutCard() {
		int quantityOfEmployeeInOfficeWithoutCard = 0;
		for (Employee employee : this.list) {
			if (employee.getStatusOfPerson() == StatusOfPerson.IN_OFFICE_WITHOUT_CARD) {
				quantityOfEmployeeInOfficeWithoutCard++;
			}
		}
		return quantityOfEmployeeInOfficeWithoutCard;
	}


	@Override
	public String toString() {
		return "Journal{" +
				"list=" + list +
				'}';
	}

	public static class IdCard implements Serializable{
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
