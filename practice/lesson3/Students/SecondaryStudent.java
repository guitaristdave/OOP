package practice.lesson3.Students;

import practice.lesson3.Interfaces.Playable;
import practice.lesson3.Interfaces.Smokable;
import practice.lesson3.Students.Base.Student;

public class SecondaryStudent extends Student implements Smokable, Playable{

    private boolean isSmoker = false;

    public SecondaryStudent(String name, String lastname, int grade) {
        super(name, lastname, grade);
    }

    public SecondaryStudent() {
        super("Дмитрий", "Сычев", 7);
    }

    @Override
    public void study() {
        System.out.println("Я ненавижу учиться");
    }

    @Override
    public void playing() {
        System.out.println("Я играю в Brawl Stars");
    }

    @Override
    public void smoking() {
        if (isSmoker) System.out.println("Я начинаю курить");
        else System.out.println("Я не курю");
    }

    @Override
    public void startSmoking() {
        this.isSmoker = true;
        System.out.println("Я умею курить");
    }

    @Override
    public void stopSmoking() {
        this.isSmoker = false;
        System.out.println("Я бросил курить");
    }
}
