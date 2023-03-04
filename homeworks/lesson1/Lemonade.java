package homeworks.lesson1;

public class Lemonade extends Drinks {

    private boolean soda;

    public Lemonade(String name, double price, double amount, String unit, float vol, boolean soda) {
        super(name, price, amount, unit, vol);
        this.soda = soda;
    }

    public Lemonade() {
        super("Coca-Cola", 51, 1, "шт", 0.33);
        this.soda = true;
    }

    public boolean getSoda() {
        return this.soda;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n%s\nГазированный: %b", this.getClass().getSimpleName(), super.toString(),
                this.soda);
        return result;
    }
}
