package homeworks.lesson1;

public class Program {
    public static void main(String[] args) {
        Goods bread = new Bread();
        Goods diaper = new Diaper();
        Goods eggs = new Eggs();
        Goods milk = new Milk();
        Goods lemonade = new Lemonade();
        Goods fasemask = new Facemask();
        Goods toiletPaper = new ToiletPaper();
        Goods nipple = new Nipple();
        goodsDemo(bread);
        goodsDemo(diaper);
        goodsDemo(eggs);
        goodsDemo(milk);
        goodsDemo(lemonade);
        goodsDemo(fasemask);
        goodsDemo(toiletPaper);
        goodsDemo(nipple);

    }

    public static void goodsDemo (Goods obj) {
        System.out.println(obj);
        System.out.println("--------");
    }
}
