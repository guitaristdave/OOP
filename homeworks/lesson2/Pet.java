import java.time.LocalDate;

public abstract class Pet extends Animal {
    private String name;
    private String breed;
    private boolean isVaccinated;
    private String woolColor;
    private LocalDate birthDate;

    public Pet(int height, int weight, String eyeColor, String voice, String name, String breed, boolean isVaccinated,
            String woolColor, int year, int month, int day) {
        super(height, weight, eyeColor, voice);
        this.name = name;
        this.breed = breed;
        this.isVaccinated = isVaccinated;
        this.woolColor = woolColor;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public boolean isVaccinated() {
        return this.isVaccinated;
    }

    public String getWoolColor() {
        return this.woolColor;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public abstract void showCaress();

    @Override
    public String toString() {
        String result = String.format("Кличка: %s\nПорода: %s\nПривит: %b\nЦвет шерсти: %s\nДата рождения: %s\n%s",
                this.name, this.breed, this.isVaccinated, this.woolColor, this.birthDate, super.toString());
        return result;
    }
}
