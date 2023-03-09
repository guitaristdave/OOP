package practice.lesson3.Students;

import practice.lesson3.Interfaces.AfterSchool;
import practice.lesson3.Interfaces.Playable;
import practice.lesson3.Students.Base.Student;

public class PrimaryStudent extends Student implements Playable, AfterSchool{

    public PrimaryStudent(String name, String lastname, int grade) {
        super(name, lastname, grade);
    }
    
    public PrimaryStudent() {
        super("Федор", "Двинятин", 3);
    }

    @Override
    public void study() {
        System.out.println("Я люблю учиться");
    }

    public void afterSchool() {
        System.out.println("Я хожу в продленку");
    }

    @Override
    public void playing() {
        System.out.println("Я играю в игрушки");        
    }
}
