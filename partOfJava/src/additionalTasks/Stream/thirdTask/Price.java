package additionalTasks.Stream.thirdTask;

public class Price {

	int value;

	public Price(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Price{" +
				"value=" + value +
				'}';
	}
}

