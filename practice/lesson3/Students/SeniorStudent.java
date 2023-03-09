package practice.lesson3.Students;

import practice.lesson3.Interfaces.InLove;
import practice.lesson3.Interfaces.Smokable;
import practice.lesson3.Students.Base.Student;

public class SeniorStudent extends Student implements Smokable, InLove {

    private boolean isSmoker = false;

    public SeniorStudent(String name, String lastname, int grade) {
        super(name, lastname, grade);
    }

    public SeniorStudent() {
        super("Михаил", "Ломоносов", 10);
    }

    @Override
    public void smoking() {
        if (isSmoker) System.out.println("Я бросаю курить");
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

    @Override
    public void study() {
        System.out.println("Я должен учиться");
    }

    public void fallInLove() {
        System.out.println("Я ищу себе пару");
    }

    
}
