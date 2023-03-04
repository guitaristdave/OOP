package homeworks.lesson1;

public class ChildGoods extends Goods {
    private double minAge;
    private boolean hypoallergic;

    public ChildGoods(String name, double price, double amount, String unit, double minAge, boolean hypoallergic) {
        super(name, price, amount, unit);
        this.minAge = minAge;
        this.hypoallergic = hypoallergic;
    }

    public double getMinAge() {
        return this.minAge;
    }

    public boolean getHypoallergic() {
        return this.hypoallergic;
    }

    @Override
    public String toString() {
        String result = String.format("%s\nМинимальный возраст: %.2f\nГипоаллергенность: %b", super.toString(),
                this.minAge, this.hypoallergic);
        return result;
    }
}
