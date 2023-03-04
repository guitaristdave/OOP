package homeworks.lesson1;

public class Facemask extends Hygienics {
    private String material;

    public Facemask(String name, double price, double amount, String unit, int packSize, String material) {
        super(name, price, amount, unit, packSize);
        this.material = material;
    }

    public Facemask() {
        super("Маска одноразовая", 5, 1, "шт", 50);
        this.material = "Ткань";
    }

    public String getMaterial() {
        return this.material;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n%s\nМатериал: %s шт", this.getClass().getSimpleName(), super.toString(),
                this.material);
        return result;
    }
}
