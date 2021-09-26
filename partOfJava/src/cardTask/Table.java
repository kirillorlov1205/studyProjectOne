package cardTask;

public class Table {
	private int countOfCard;

	public void putCard(int card) {
		this.countOfCard += card;
	}

	public int getAllCards() {
		int CountOfContainer = countOfCard;
		countOfCard = 0;
		return CountOfContainer;
	}

}
