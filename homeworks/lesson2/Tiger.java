public class Tiger extends Wild{

    public Tiger(int height, int weight, String eyeColor, String voice, String areal, int year, int month, int day) {
        super(height, weight, eyeColor, voice, areal, year, month, day);
    }

    public Tiger() {
        super(68, 250, "коричневый", "Р-Р-Р-Р", "Сибирь", 1560, 2, 14);
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n", this.getClass().getSimpleName(), super.toString());
    }

    
}
