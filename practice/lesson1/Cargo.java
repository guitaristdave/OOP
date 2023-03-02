package practice.lesson1;

public class Cargo extends Transport{
    public Cargo(String color, int weight, int maxSpeed, String brandName, String modelName) {
        super(color, 6, weight, maxSpeed, brandName, modelName);
    }

    public Cargo() {
        super("Black", 6, 4000, 150, "Gazelle", "Next");
    }
}

