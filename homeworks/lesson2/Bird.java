public abstract class Bird extends Animal {
    private int flyingHeight;

    public Bird(int height, int weight, String eyeColor, String voice, int flyingHeight) {
        super(height, weight, eyeColor, voice);
        this.flyingHeight = flyingHeight;
    }

    public int getFlyingHeight() {
        return this.flyingHeight;
    }

    public void flying() {
        System.out.println("Я лечу на высоте " + this.flyingHeight + " метров");
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\nВысота полета: %d м\n", this.getClass().getSimpleName(), super.toString(),
                this.flyingHeight);
    }
}



