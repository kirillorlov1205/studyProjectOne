package additionalTasks.cardTask;

public class Lead implements Runnable {
	Table table;

	public Lead(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		int currentCount;
		do {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			currentCount = table.getAllCards();
			System.out.println("Get all cards: " + currentCount);
		} while (currentCount > 0);

	}
}
