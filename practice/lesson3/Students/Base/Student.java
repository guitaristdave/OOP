package practice.lesson3.Students.Base;

public abstract class Student implements Comparable<Student>{
    private String name;
    private String lastname;
    private int grade;

    public Student(String name, String lastname, int grade) {
        this.name = name;
        this.lastname = lastname;
        this.grade = grade;
    }

    public abstract void study();

    @Override
    public String toString() {
        return String.format("%s\nИмя: %s\nФамилия: %s\nКласс: %d", this.getClass().getSimpleName(), this.name,
                this.lastname, this.grade);
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        if (this.grade > o.grade) return 1;
        else if (this.grade < o.grade) return -1;
        else return 0;
    }
    
}
