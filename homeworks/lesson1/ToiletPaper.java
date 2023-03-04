package homeworks.lesson1;

public class ToiletPaper extends Hygienics {

    private int layers;

    public ToiletPaper(String name, double price, double amount, String unit, int packSize, int layers) {
        super(name, price, amount, unit, packSize);
        this.layers = layers;
    }

    public ToiletPaper() {
        super("Zewa", 34, 1, "шт", 12);
        this.layers = 4;
    }

    public int getLayers() {
        return layers;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n%s\nСлоев: %d шт", this.getClass().getSimpleName(), super.toString(),
                this.layers);
        return result;
    }

}
