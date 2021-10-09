package additionalTasks.lesson5.Task1;

public class Birds {

	private static double sumOfBirds;

	private final String typeOfBird;
	private double weight;

	{
		weight = 0;
	}

	public Birds(String typeOfBird) {
		this.typeOfBird = typeOfBird;
		sumOfBirds += this.weight;
	}

	public Birds(String typeOfBird, double weight) {
		this.weight = weight;
		this.typeOfBird = typeOfBird;
		sumOfBirds += weight;
	}

	//    get-set
	public static double getSumOfBirds() {
		return sumOfBirds;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		sumOfBirds -= this.weight;
		this.weight = weight;
		sumOfBirds += weight;
	}

	public String getTypeOfBird() {
		return typeOfBird;
	}
}

