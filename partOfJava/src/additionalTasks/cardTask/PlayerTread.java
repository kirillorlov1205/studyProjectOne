package additionalTasks.cardTask;

public class PlayerTread implements Runnable {
	Table table;
	private int countOfCards = 10;


	public PlayerTread(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		do {
			synchronized (table) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				table.putCard(1);
				countOfCards--;
				System.out.println("Player" + Thread.currentThread().getName() + " placed 1 card on the table");
			}
		} while (countOfCards > 0);


	}
}
