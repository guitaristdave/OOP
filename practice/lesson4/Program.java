package practice.lesson4;


public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(JSONConvert.convertor(cat));
        System.out.println(JSONConvert.convertor(123));
        System.out.println(JSONConvert.convertor("test"));
        System.out.println(JSONConvert.convertor(null));
    }
}
