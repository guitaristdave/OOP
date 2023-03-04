package homeworks.lesson1;

public class Eggs extends Food {
    private String birdType;

    public Eggs(String name, double price, double amount, String unit, int day, int month, int year, String birdType) {
        super(name, price, amount, unit, day, month, year);
        this.birdType = birdType;
    }

    public Eggs() {
        super("Ряба", 89, 10, "шт", 12, 9, 2024);
    }

    public String getBirdType() {
        return this.birdType;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n%s\nТип птицы: %s", this.getClass().getSimpleName(), super.toString(), this.birdType);
        return result;
    }

}

