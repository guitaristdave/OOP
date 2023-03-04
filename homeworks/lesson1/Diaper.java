package homeworks.lesson1;

public class Diaper extends ChildGoods {
    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public Diaper(String name, double price, double amount, String unit, double minAge, boolean hypoallergic, int size,
            int minWeight, int maxWeight, String type) {
        super(name, price, amount, unit, minAge, hypoallergic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public Diaper() {
        super("Pampers", 500, 30, "шт", 0.5, true);
        this.size = 3;
        this.minWeight = 10;
        this.maxWeight = 15;
        this.type = "Одноразовые";
    }

    public int getSize() {
        return this.size;
    }

    public int getMinWeight() {
        return this.minWeight;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n%s\nРазмер: %d\nМинимальный вес: %d\nМаксимальный вес: %d\nТип: %s",
                this.getClass().getSimpleName(),
                super.toString(), this.size, this.minWeight, this.maxWeight, this.type);
        return result;
    }
}
