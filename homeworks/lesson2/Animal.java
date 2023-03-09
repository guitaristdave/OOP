public abstract class Animal {
    private int height;
    private int weight;
    private String eyeColor;
    private String voice;

    public Animal(int height, int weight, String eyeColor, String voice) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.voice = voice;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public String getVoice() {
        return this.voice;
    }

    public void roar() {
        System.out.println("Голос: " + this.voice);
    }

    @Override
    public String toString() {
        String result = String.format("Рост: %d см\nВес: %d кг\nЦвет глаз: %s", this.height, this.weight, this.eyeColor);
        return result;
    }
}