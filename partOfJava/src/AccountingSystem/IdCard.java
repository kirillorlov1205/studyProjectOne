package AccountingSystem;

import java.util.concurrent.ThreadLocalRandom;

public class IdCard {
	private final long id;

	public IdCard() {
//		id = UUID.randomUUID().toString();
		id = ThreadLocalRandom.current().nextLong(1000000000L, 10000000000L);
	}

	public long getId() {
		return id;
	}
}
