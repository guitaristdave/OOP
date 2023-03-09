public class Wolf extends Wild{

    protected boolean isAlpha;

    public Wolf(int height, int weight, String eyeColor, String voice, String areal, int year, int month, int day,
            boolean isAlpha) {
        super(height, weight, eyeColor, voice, areal, year, month, day);
        this.isAlpha = isAlpha;
    }

    public Wolf() {
        super(45, 90, "коричневый", "А-у-у-у-у", "Тамбов", 1790, 3, 22);
        this.isAlpha = true;
    }  

    @Override
    public String toString() {
        return String.format("%s\n%s\nВожак: %b\n", this.getClass().getSimpleName(), super.toString(), this.isAlpha);
    }
}
