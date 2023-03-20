package practice.lesson4;


public class Cat {

    private String name;
    private int age;
    private String color;
    private int weight;
    private int height;

    public Cat(String name, int age, String color, int weight, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public Cat() {
        this("Bars", 4, "black", 7, 20);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

}
