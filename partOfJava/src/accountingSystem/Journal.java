package accountingSystem;

import accountingSystem.person.StatusOfPerson;
import accountingSystem.person.employee.Employee;
import accountingSystem.validators.EmployeeListValidator;
import accountingSystem.validators.ExistingInListException;
import accountingSystem.validators.LimitOfEmployeeValidator;
import accountingSystem.validators.OutOfListLimitExaption;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Journal implements Serializable {

	static ArrayList<Employee> list;
	static private int listSize;

	public Journal(int size) {
		list = new ArrayList<>(size);
		listSize = size;
	}

	public static void closeJournal(Journal journal) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serializable.obraz"))) {
			oos.writeObject(journal);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//todo: Не получается реализовать десериализацию в методе
	public static Journal openJournal(Journal journal) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Serializable.obraz"));
			journal = (Journal) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return journal;
	}

	public static List<Employee> getAllEmployee() {
		return list;
	}

	public static int getListSize() {
		return listSize;
	}

	public void registerEmployee(Employee employee) {
		try {
			EmployeeListValidator.isEmployeeExistsInList(employee, list);
			LimitOfEmployeeValidator.canBeAddedToList(employee, list);
			employee.setIdCard(new IdCard());
			list.add(employee);
		} catch (ExistingInListException | OutOfListLimitExaption e) {
			// TODO: 10/2/2021 Add reworking for exception catching [Pavel.Chachotkin]
			e.printStackTrace();
		}
	}

	public void registerEmployeeList(ArrayList<Employee> employeeList) {
		try {
			// TODO: 10/2/2021 Invalid solution [Pavel.Chachotkin]
			LimitOfEmployeeValidator.canEmployeeListBeAddedToList(employeeList, list);
		} catch (OutOfListLimitExaption e) {
			// TODO: 10/2/2021 Add reworking for exception catching [Pavel.Chachotkin]
			e.printStackTrace();
		}
	}

	public void enterToOffice(Employee employee) {
		// TODO: 10/2/2021 This solution has redundant check. Use equal instead [Pavel.Chachotkin]
		for (Employee employee1 : list) {
			if (employee1 == null) {
				// TODO: 10/2/2021 Just break? [Pavel.Chachotkin]
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

	public void goFromOffice(Employee employee) {
		list.remove(employee);
		// TODO: 10/2/2021 Just remove from list? [Pavel.Chachotkin]
	}

	public int getQuantityOfEmployeeInOffice() {
		int quantityOfEmployeeInOffice = 0;
		for (Employee employee : list) {
			if (employee == null) {
				// TODO: 10/2/2021 Does your list can contains NULL value? [Pavel.Chachotkin]
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

	// TODO: 10/2/2021 How user will use this method? [Pavel.Chachotkin]
	public Employee getEmployee(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return "Journal{" +
				"list=" + list +
				'}';
	}

	public static class IdCard {
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
