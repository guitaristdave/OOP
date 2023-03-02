package practice.lesson1;

public class Transport {

    enum State {
        On, Off
    }

    private State state;

    private String color;
    private int wheelCount;
    private int weight;
    private int maxSpeed;
    private String brandName;
    private String modelName;

    public Transport(String color, int wheelCount, int weight, int maxSpeed, String brandName, String modelName) {
        this.color = color;
        this.wheelCount = wheelCount;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.brandName = brandName;
        this.modelName = modelName;
        this.state = State.Off;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, Model: %s, Color: %s, Max speed: %d, Wheels: %d, Weight: %d", this.brandName,
                this.modelName, this.color, this.maxSpeed, this.wheelCount, this.weight);
    }

    public String getColor() {
        return this.color;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getWheelCount() {
        return this.wheelCount;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        if (this.state == State.Off) {
            System.out.println("E-ron-don-don");
            this.state = State.On;
        }

    }

    public void stop() {
        if (this.state != State.Off) {
            System.out.println("STOP!");
            this.state = State.Off;
        }
    }
}
