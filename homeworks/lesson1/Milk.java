package homeworks.lesson1;

public class Milk extends Food {

    private double fatness;

    public Milk(String name, double price, double amount, String unit, int day, int month, int year, double fatness) {
        super(name, price, amount, unit, year, month, day);
        this.fatness = fatness;
    }

    public Milk() {
        super("Молочная станция", 65.4, 940, "мл", 18, 9, 2023);
        this.fatness = 3.2;
    }

    public double getFatness() {
        return this.fatness;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n%s\nЖирность: %.2f", this.getClass().getSimpleName(), super.toString(),
                this.fatness);
        return result + " %";
    }

}
