package practice.lesson1;

public class Program {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bicycle = new Bicycle();
        Transport motorcycle = new Motorcycle();
        Transport cargo = new Cargo();

        System.out.println(car);
        car.move();
        car.stop();
        System.out.println(bicycle);
        bicycle.move();
        bicycle.stop();
        System.out.println(motorcycle);
        motorcycle.move();
        motorcycle.stop();
        System.out.println(cargo);
        cargo.move();
        cargo.stop();
    }
}
