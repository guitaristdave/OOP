package homeworks.lesson1;

public class Hygienics extends Goods {
    private int packSize;

    public Hygienics(String name, double price, double amount, String unit, int packSize) {
        super(name, price, amount, unit);
        this.packSize = packSize;
    }

    public int getPackSize() {
        return this.packSize;
    }

    @Override
    public String toString() {
        String result = String.format("%s\nРазмер упаковки: %d шт", super.toString(), this.packSize);
        return result;
    }

}
