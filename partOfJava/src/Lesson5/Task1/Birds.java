package Lesson5.Task1;

public class Birds {

    private static int sumOfBirds;

    private String typeOfBird;
    private int weight;

    {
        weight = 2;
    }

    public Birds(String typeOfBird) {
        this.typeOfBird = typeOfBird;
        sumOfBirds += weight;
    }

    public Birds(String typeOfBird, int weight) {
        this.typeOfBird = typeOfBird;
        sumOfBirds += weight;
    }

    //    get-set
    public static int getSumOfBirds() {
        return sumOfBirds;
    }

    public int getWeight() {
        return weight;
    }

    public String getTypeOfBird() {
        return typeOfBird;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}

