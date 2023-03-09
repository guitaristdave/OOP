public class Dog extends Pet{
    protected boolean isTrained;

    public Dog(int height, int weight, String eyeColor, String voice, String name, String breed, boolean isVaccinated,
            String woolColor, int year, int month, int day, boolean isTrained) {
        super(height, weight, eyeColor, voice, name, breed, isVaccinated, woolColor, year, month, day);
        this.isTrained = isTrained;
    }

    public Dog() {
        super(42, 36, "карий", "гав", "Добрый Вечер", "Корги", true, "белый-черный-коричневый", 2012, 5, 16);
        this.isTrained = true;
    }

    public boolean isTrained() {
        return this.isTrained;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\nПодается дрессировке: %b\n", this.getClass().getSimpleName(), super.toString(), this.isTrained);
    }


    @Override
    public void showCaress() {
        System.out.println("Подошел к человеку, начал вилять хвостом и облизывать руки");
        
    }

    public void training() {
        if (this.isTrained) {
            System.out.println("Дрессировка: учим новые команды");
        }
        else System.out.println("Я ничего не знаю.");
    }
}
