package additionalTasks.lesson5.Task2;

public class Chair {
	String madeBy;

	class Legs {

		int legQuantity;
		boolean inTheFlat;

		public Legs(int legQuantity, boolean inTheFlat) {
			this.legQuantity = legQuantity;
			this.inTheFlat = inTheFlat;
		}

		public void legBreak() {
			System.out.println("leg is broken");
		}
	}

	class Backrest {

		public void makeBackDown() {
			System.out.println("Back is Down");
		}

		public void makeBackUp() {
			System.out.println("Back is Up");
		}
	}

	class Seat {

		public void makeSeatDown() {
			System.out.println("Seat is down");
		}

		public void makeSeatUp() {
			System.out.println("Seat is up");
		}
	}

}

