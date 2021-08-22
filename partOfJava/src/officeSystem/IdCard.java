package officeSystem;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class IdCard {
	//	У каждого сотрудника дожна быть возможность получить айди карту (Карта с уникальным номером длинной 10 символов)
//Карта предоставляется сотруднику при регистрации. Сотрудник должен предоставить Имя и Фамилию системе. Система
// должна зарегестрировать сотрудника и выдать ему айди карты. Сотрудник должен присвоить себе
// эту айди карту и пользоваться только ей для возможности попасть в офис.
	Random random = new Random();
	private long id;

	public IdCard() {
		id = ThreadLocalRandom.current().nextLong(1000000000L,10000000000L);
	}

	public long getId() {
		return id;
	}
}
