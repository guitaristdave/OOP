import java.time.LocalDate;

public abstract class Wild extends Animal {
    private String areal;
    private LocalDate findingDate;
    public Wild(int height, int weight, String eyeColor, String voice, String areal, int year, int month, int day) {
        super(height, weight, eyeColor, voice);
        this.areal = areal;
        this.findingDate = LocalDate.of(year, month, day);
    }
    public String getAreal() {
        return this.areal;
    }
    public LocalDate getFindingDate() {
        return this.findingDate;
    }

    @Override
    public String toString() {
        String result = String.format("Место обитания: %s\nДата обнаружения: %s\n%s", this.areal, this.findingDate, super.toString());
        return result;
    }
    
}

