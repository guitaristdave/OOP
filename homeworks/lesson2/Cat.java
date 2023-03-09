public class Cat extends Pet{
    protected boolean hasWool;

    public Cat(int height, int weight, String eyeColor, String voice, String name, String breed, boolean isVaccinated,
            String woolColor, int year, int month, int day, boolean hasWool) {
        super(height, weight, eyeColor, voice, name, breed, isVaccinated, woolColor, year, month, day);
        this.hasWool = hasWool;
    }

    public Cat() {
        super(25, 9, "голубой", "Мяу", "Олег", "Дворняга", false, "серый", 1993, 9, 18);
        this.hasWool = true;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n", this.getClass().getSimpleName(), super.toString());
    }

    @Override
    public void showCaress() {
        System.out.println("Подошел к человеку и глажусь об его ногу. м-р-р-р-р-р");
    }
    
}
