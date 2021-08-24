package AccountingSystem;

import AccountingSystem.Persons.Employee.Employee;
import AccountingSystem.Persons.StatusOfPerson;

public class Journal {
//	При попытке пройти пункт контроля, должна проверяться айди карта сотрудника.
//Если такая есть в системе и совпадает с именем и фамилией сотрудника – сотрудника можно пропустить.
//Иначе у сотрудника должна быть пометка, которая сообщает системе, что данный сотрудник был пропущен по нажатию кнопки вахтера

	private static int index = 0;
	Employee[] personsArr = new Employee[15];

	public void addToPersonArr(Employee employee) {
		if (index > personsArr.length - 1) { //todo: хотел написать "personsArr[index] > personsArr.length"  - не работает, прошу объяснить
			System.out.println("Out of limit of Persons");
			return;
		} else {
			personsArr[index++] = employee;
		}
	}

//	public int countPersonInOfficeWithCard() {
//		int countPersonInOfficeWithCard = 0;
//		for (int i = 0; i < personsArr.length - 1; i++) {
//			if (personsArr[i].getStatusOfPerson() == StatusOfPerson.INOFFICE) {
//				countPersonInOfficeWithCard++;
//			}
//			if (personsArr[i] == null) {
//				return countPersonInOfficeWithCard;
//			}
//		}
//		return countPersonInOfficeWithCard;
//	}

	public void checkpoint(Employee employee) {
		for (int i = 0; i < personsArr.length - 1; i++) {
			if (personsArr[i] == null) {
				break;
			}
			if (personsArr[i].getIdCard().getId() == employee.getIdCard().getId() &&
					personsArr[i].getfName().equals(employee.getfName()) &&
					personsArr[i].getlName().equals(employee.getlName())
			) {
				employee.setStatusOfPerson(StatusOfPerson.INOFFICE);
				return;
			}
		}
		employee.setStatusOfPerson(StatusOfPerson.INOFFICEWITHOUTCARD);
	}

	public Employee getEmployee(int index) {
		return personsArr[index];
	}

}
