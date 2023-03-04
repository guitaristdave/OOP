package homeworks.lesson1;

import java.time.LocalDate;

public class Food extends Goods {

    public static void main(String[] args) {

    }

    private LocalDate exprdate;

    public Food(String name, double price, double amount, String unit, int day, int month, int year) {
        super(name, price, amount, unit);
        this.exprdate = LocalDate.of(year, month, day);
    }

    public String getExpr() {
        return this.exprdate.toString();
    }

    public void setExpr(int year, int month, int day) {
        this.exprdate = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        String result = String.format("%s\nСрок годности: %s", super.toString(), this.exprdate);
        return result;
    };

}
