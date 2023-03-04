package homeworks.lesson1;

public class Goods {

    private String name;
    private double price;
    private double amount;
    private String unit;

    public Goods(String name, double price, double amount, String unit) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        String result = String.format("Наименование: %s\nЦена: %.2f руб\nКоличество: %.2f %s", this.name, this.price,
                this.amount, this.unit);
        return result;
    }

}
