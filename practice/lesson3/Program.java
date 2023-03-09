package practice.lesson3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import practice.lesson3.Interfaces.AfterSchool;
import practice.lesson3.Interfaces.InLove;
import practice.lesson3.Interfaces.Playable;
import practice.lesson3.Interfaces.Smokable;
import practice.lesson3.Students.PrimaryStudent;
import practice.lesson3.Students.SecondaryStudent;
import practice.lesson3.Students.SeniorStudent;
import practice.lesson3.Students.Base.Student;

public class Program {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new SecondaryStudent());
        students.add(new PrimaryStudent());
        students.add(new SeniorStudent());

        Collections.sort(students);

        for (Student student : students) {
            demo(student);
            System.out.println("-----");
        }

    }

    public static void demo(Student obj) {
        System.out.println(obj);
        obj.study();
        if (obj instanceof Playable) {
            ((Playable) obj).playing();
        }
        if (obj instanceof Smokable) {
            ((Smokable) obj).startSmoking();
            ((Smokable) obj).smoking();
            ((Smokable) obj).stopSmoking();
        }
        if (obj instanceof InLove) {
            ((InLove) obj).fallInLove();
        }
        if (obj instanceof AfterSchool) {
            ((AfterSchool) obj).afterSchool();
        }
    }
}
