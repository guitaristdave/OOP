package practice.lesson1;

public class Program {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bicycle = new Bicycle();
        Transport motorcycle = new Motorcycle();
        Transport cargo = new Cargo();

        demo(car);
        demo(bicycle);
        demo(motorcycle);
        demo(cargo);
        
        

       
    }

    public static void demo(Object o) {
        System.out.println(o);
        ((Transport) o).move();
        ((Transport) o).stop();
         
    }
}
