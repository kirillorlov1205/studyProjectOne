package officeSystem.Persons;

public interface Vip {
//	У Заместителя Директора, у Директора и у Системных администраторов должна быть
//	возможность попасть в комнату 123. При попытке попасть в комнату 123 у данных
//	сотрудников должна быть возможность нажать на ручку комнаты 123. У всех остальных
//	работников компании такой возможности быть не должно

	public void turnOnTheHandleOf123Room();
}
