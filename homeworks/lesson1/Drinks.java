package homeworks.lesson1;

public class Drinks extends Goods {
    private double vol;

    public Drinks(String name, double price, double amount, String unit, double vol) {
        super(name, price, amount, unit);
        this.vol = vol;
    }

    public double getVolume() {
        return this.vol;
    }

    @Override
    public String toString() {
        String result = String.format("%s\nОбъем: %.2f", super.toString(), this.getVolume());
        return result;
    }

}
