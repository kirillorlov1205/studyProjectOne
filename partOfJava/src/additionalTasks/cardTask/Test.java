package additionalTasks.cardTask;

public class Test {
	public static void main(String[] args) {
		Table table = new Table();
		Thread player1 = new Thread(new PlayerTread(table));
		Thread player2 = new Thread(new PlayerTread(table));

		Thread lead = new Thread(new Lead(table));

		player1.start();
		player2.start();

		lead.start();

	}
}
